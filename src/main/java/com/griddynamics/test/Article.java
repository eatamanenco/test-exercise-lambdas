package com.griddynamics.test;

public class Article {

    private final String title;

	private final String author;

    public Article(String title, String author)
    {
        this.title = title;
        this.author = author;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }
}