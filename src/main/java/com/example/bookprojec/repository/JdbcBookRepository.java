package com.example.bookprojec.repository;

import javax.sql.DataSource;

public class JdbcBookRepository implements BookRepository{

    private final DataSource dataSource;

    public JdbcBookRepository(DataSource dataSource){
        this.dataSource = dataSource;
    }

    @Override
    public void borrow() {

    }

    @Override
    public void search() {

    }

    @Override
    public void bookReturn() {

    }

    @Override
    public void bookAdd() {

    }

    @Override
    public void bookList() {

    }
}
