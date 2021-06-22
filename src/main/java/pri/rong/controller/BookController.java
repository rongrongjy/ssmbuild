package pri.rong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pri.rong.pojo.Books;
import pri.rong.service.BookService;

import java.util.ArrayList;
import java.util.List;

/**
 * @description：
 * @auther lurongrong
 * @create 2021-06-15 12:19
 */
@Controller
@RequestMapping("/book")//方便以后的扩展
public class BookController {
    //controller调service层
    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService ;//注入service层的接口

    //查询全部的书籍，并且返回一个书籍展示页面
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> list = bookService.queryAllBook();

        model.addAttribute("list",list);
        return "allBook";//allBook.jsp页面
    }
    //跳转到增加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddPaper(){
        return "addBook";
    }

    //添加书籍的请求
    @RequestMapping("/addBook")
    public String addPaper(Books books) {
        System.out.println(books);
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }
    //跳转到修改页面
    @RequestMapping("/toUpdateBook")
    public String toUpdatePaper(int id,Model model){
        Books books = bookService.queryBookId(id);
        model.addAttribute("QBook",books);
        return "updateBook";
    }
    //修改书籍
    @RequestMapping("/updatebook")
    public String updateBook(Books books){
        System.out.println("updateBook==" + books);
        bookService.updateBook(books);
        return "redirect:/book/allBook";//修改完重新回到首页



    }
    //删除书籍
    @RequestMapping("/deleteBook/{bookID}")
    public String deleteBook(@PathVariable("bookID") int id){
        bookService.deleteBook(id);
        return "redirect:/book/allBook";//修改完重新回到首页

    }
    //查询书籍
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName,Model model) {
        Books books = bookService.queryBookByName(queryBookName);


        List<Books> list = new ArrayList<Books>();
        list.add(books);
        if (books == null) {
            list = bookService.queryAllBook();
            model.addAttribute("error","未查到");
        }
        model.addAttribute("list", list);
        return "allBook";//allBook.jsp页面
    }
}
