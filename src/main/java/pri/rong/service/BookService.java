package pri.rong.service;

import org.apache.ibatis.annotations.Param;
import pri.rong.pojo.Books;

import java.util.List;

/**
 * @description：
 * @auther lurongrong
 * @create 2021-06-14 21:03
 */
public interface BookService {
    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBook( int id);
    //更新一本书
    int updateBook(Books books);
    //查询一本书
    Books queryBookId( int id);
    //查询全部的书
    List<Books> queryAllBook();

    Books queryBookByName(String bookName);

}
