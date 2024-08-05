package com.aurionpro.list.model;

public class BookComparatorApp {
	 private String title;
	    private String author;
	    private double price;
	    private int publicationYear;
	    
	    public BookComparatorApp(String title, String author, double price, int publicationYear) {
	        this.title = title;
	        this.author = author;
	        this.price = price;
	        this.publicationYear = publicationYear;
	    }
	    
	    public String getTitle() {
	        return title;
	    }
	    
	    public String getAuthor() {
	        return author;
	    }
	    
	    public double getPrice() {
	        return price;
	    }
	    
	    public int getPublicationYear() {
	        return publicationYear;
	    }
	    
	    @Override
	    public String toString() {
	        return "Book [title=" + title + ", author=" + author + ", price=" + price + ", publicationYear=" + publicationYear + "]";
	    }	
}
