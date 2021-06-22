package pri.rong.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pri.rong.dao.BookMapper;
import pri.rong.pojo.Books;

import java.util.List;

/**
 * @description：
 * @auther lurongrong
 * @create 2021-06-14 21:05
 */
//@Service
public class BookServiceImpl implements BookService{
    //service调用dao层 组合dao
//    @Autowired
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBook(int id) {
        return bookMapper.deleteBook(id);
    }

    @Override
    public int updateBook(Books books) {
        System.out.println("updatebook=="+books);
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookId(int id) {
        return bookMapper.queryBookId(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    @Override
    public Books queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }
}
