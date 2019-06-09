package com.timeselectrical.model;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Article {
    private String title;
    private String content;
    private String url;

    public Article(String title, String content, String url) {
        this.title = title;
        this.content = content;
        this.url = url;
    }
}
