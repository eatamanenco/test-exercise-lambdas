package com.griddynamics.test;

import java.util.ArrayList;
import java.util.List;

public class CategoryService
{
    public List<Category> getAll()
    {
        return getDummyData();
    }

    private List<Category> getDummyData()
    {
        List<Category> categories = new ArrayList<>();

        // Category 1
        Category category1 = new Category("Technology");
        category1.addArticle(new Article("How to Build a Computer", "John Doe"));
        category1.addArticle(new Article("The Future of AI", "Jane Smith"));
        categories.add(category1);

        // Category 2
        Category category2 = new Category("Science");
        category2.addArticle(new Article("Quantum Mechanics Explained", "Alice Johnson"));
        category2.addArticle(new Article("The Importance of Space Exploration", "Bob Williams"));
        categories.add(category2);

        // Category 3
        Category category3 = new Category("Health");
        category3.addArticle(new Article("Benefits of Regular Exercise", "Emily Brown"));
        category3.addArticle(new Article("Mental Health Awareness", "Michael Davis"));
        categories.add(category3);

        // Category 4
        Category category4 = new Category("Business");
        category4.addArticle(new Article("Entrepreneurship 101", "David Lee"));
        category4.addArticle(new Article("Investment Strategies", "Sophia Wilson"));
        categories.add(category4);

        // Category 5
        Category category5 = new Category("Travel");
        category5.addArticle(new Article("Top Destinations for 2024", "Oliver Taylor"));
        category5.addArticle(new Article("Traveling on a Budget", "Emma Martinez"));
        categories.add(category5);

        return categories;
    }
}
