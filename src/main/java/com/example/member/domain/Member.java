package com.example.member.domain;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class Member {
    private Long id;
    private String name;
}
