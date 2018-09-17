package com.example.demo.entity;

import lombok.Data;

@Data
public class Course {
    private String imgLink;
    private String title;

    public  Course(){

    }

    public Course(String imgLink, String title) {
        this.imgLink = imgLink;
        this.title = title;
    }
}
