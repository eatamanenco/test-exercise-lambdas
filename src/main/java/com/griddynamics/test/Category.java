package com.griddynamics.test;

import java.util.ArrayList;
import java.util.List;

public class Category {

    private final String name;

    private final List<Article> articles;

    public Category(String name)
    {
        this.name = name;
        this.articles = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    public List<Article> getArticles()
    {
        return articles;
    }

    public void addArticle(Article article)
    {
        this.articles.add(article);
    }
}
