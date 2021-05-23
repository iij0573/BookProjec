package com.example.bookprojec.domain;

import lombok.Data;

@Data
public class BookVO {
    private int BookNum;
    private String title;
    private String author;
    private float grade;
    private int stock;
    private Boolean rental;
}
