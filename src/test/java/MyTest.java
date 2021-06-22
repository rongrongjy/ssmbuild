import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pri.rong.pojo.Books;
import pri.rong.service.BookService;
import pri.rong.service.BookServiceImpl;

/**
 * @description：
 * @auther lurongrong
 * @create 2021-06-15 13:32
 */
public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = context.getBean("BookServiceImpl", BookService.class);
        for (Books books : bookServiceImpl.queryAllBook()) {
            System.out.println(books);
        }
    }

}
