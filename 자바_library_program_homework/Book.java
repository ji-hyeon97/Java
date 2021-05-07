package com.homework;
public class Book {
    private String name;
    private String author;
    private double price;
    private String category;
    private boolean state;
    Book(String name,String author,double price,String category,boolean state){
        this.name = name;
        this.author = author;
        this.price = price;
        this.category = category;
        this.state = state;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public boolean getState() {
        return state;
    }
    public void setState(boolean state) {
        this.state = state;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}