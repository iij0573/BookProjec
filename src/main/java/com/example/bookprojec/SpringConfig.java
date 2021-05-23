package com.example.bookprojec;

import com.example.bookprojec.repository.BookRepository;
import com.example.bookprojec.repository.JdbcBookRepository;
import com.example.bookprojec.repository.MemoryBookRepository;
import com.example.bookprojec.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private DataSource dataSource;

    @Autowired
    public  SpringConfig(DataSource dataSource){
        this.dataSource = dataSource;
    }

    @Bean
    public BookService bookService(){
        return new BookService(bookRepository());
    }

    @Bean
    public BookRepository bookRepository(){
        //return new MemoryBookRepository();
        return new JdbcBookRepository(dataSource);
    }
}
