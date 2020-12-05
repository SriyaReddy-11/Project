package com.example.shoponline.Models;

public class Category {
    String CategoryName;

    public Category(String categoryName) {
        CategoryName = categoryName;
    }

    public Category() {
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }
}
