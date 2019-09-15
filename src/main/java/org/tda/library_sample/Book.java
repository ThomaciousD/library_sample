package org.tda.library_sample;

import java.util.Date;

public class Book {
    
    private String isbn; 
    private String title; 
    
    private double price;
    private Date issueDate;
    
    public Book(String title) {
        super();
        this.title = title;
    }
    
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Date getIssueDate() {
        return issueDate;
    }
    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }
    
    @Override
    public String toString() {
        return "Title: "+this.title;
    }
}
