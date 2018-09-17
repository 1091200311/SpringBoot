package com.example.demo.entity;

import lombok.Data;

@Data
public class Card {
    private String imgLink;
    private String info;
    private String summary;
    public Card(){

    }

    public Card(String imgLink, String info, String summary) {
        this.imgLink = imgLink;
        this.info = info;
        this.summary = summary;
    }
}
