package com.example.bookprojec.service;

import com.example.bookprojec.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    public BookService(BookRepository bookRepository) {
    }
}
