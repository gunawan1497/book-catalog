package com.subrutin;

import com.subrutin.config.AppConfig;
import com.subrutin.domain.Author;
import com.subrutin.dto.BookDetailDTO;
import com.subrutin.service.BookService;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        ApplicationContext appCtx = new ClassPathXmlApplicationContext("(diganti appconfig)application-context.xml");
//        ApplicationContext appCtx = new FileSystemXmlApplicationContext("C:\\TIK-PSPM\\book-catalog\\src\\main\\resources\\(diganti appconfig)application-context.xml");
        ApplicationContext appCtx = new AnnotationConfigApplicationContext(AppConfig.class);
        BookService bs = (BookService) appCtx.getBean("bookService");
        BookDetailDTO dto = bs.findBookDetailById(1L);
        System.out.println("Book Detail = "+dto);

//        Author author = new Author();
//        dibawah ini pengganti dari baris diatas
//        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("(diganti appconfig)application-context.xml");
//        Author author = (Author) appContext.getBean("author");
//        System.out.println("author id: " + author.getId());
//        System.out.println("author name: " + author.getName());
//        BookService bookService = (BookService) appContext.getBean("bookService");
//        BookDetailDTO bookDetailDTO = bookService.findBookDetailById(2L);
//        System.out.println("book detail ="+bookDetailDTO);

//        Author author = (Author) appContext.getBean("author");
//        System.out.println("Author :"+author);
    }
}
