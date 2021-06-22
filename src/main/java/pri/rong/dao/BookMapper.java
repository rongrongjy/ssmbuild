package pri.rong.dao;

import org.apache.ibatis.annotations.Param;
import pri.rong.pojo.Books;

import java.util.List;

/**
 * @description：
 * @auther lurongrong
 * @create 2021-06-14 19:01
 */
public interface BookMapper {
    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBook(@Param("bookId") int id);
    //更新一本书
    int updateBook(Books books);
    //查询一本书
    Books queryBookId(@Param("bookId") int id);
    //查询全部的书
    List<Books> queryAllBook();
    //为安全起见加上 @Param("bookName")
    Books queryBookByName(@Param("bookName") String bookName);
}
