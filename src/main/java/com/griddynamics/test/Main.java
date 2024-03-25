package com.griddynamics.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main
{
    private static final CategoryService categoryService = new CategoryService();

    public static void main(String[] args)
    {
        List<Category> categories = categoryService.getAll();

        List<Article> articles = new ArrayList<>();

        for (Category category: categories) {
            articles.addAll(category.getArticles());
        }

        List<String> titles = new ArrayList<>();

        for (Article article: articles) {
            if (article.getTitle().startsWith("T")) {
                titles.add(article.getTitle());
            }
        }

        titles.sort(new Comparator<String>() {
            public int compare(String title1, String title2) {
                return title2.compareTo(title1);
            }
        });

        for (String title: titles) {
            System.out.println(title);
        }
    }
}
