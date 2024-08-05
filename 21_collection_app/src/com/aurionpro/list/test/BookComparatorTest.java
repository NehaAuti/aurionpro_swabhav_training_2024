package com.aurionpro.list.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.aurionpro.list.model.BookComparator;
import com.aurionpro.list.model.BookComparatorApp;

public class BookComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<BookComparatorApp> books = new ArrayList<BookComparatorApp>();
	        
	        books.add(new BookComparatorApp("A Tale of Two Cities", "George Orwell", 450, 2011));
	        books.add(new BookComparatorApp("The Hobbit", "J.R.R Tolkien", 950, 2008));
	        books.add(new BookComparatorApp("As You Like It", "William Shakespeare", 750, 2000));
	        books.add(new BookComparatorApp("Shape of things to Come", "H.G Wells", 800, 2007));
	        
	        Collections.sort(books, new BookComparator.BookTitleComparator());
	        System.out.println("Books Sorted by Title:");
	        for (BookComparatorApp book : books)
	            System.out.println(book);
	        
	        Collections.sort(books, new BookComparator.BookAuthorComparator());
	        System.out.println("Books Sorted by Author:");
	        for (BookComparatorApp book : books)
	            System.out.println(book);
	        
	        Collections.sort(books, new BookComparator.BookPriceComparator());
	        System.out.println("Books Sorted by Price:");
	        for (BookComparatorApp book : books)
	            System.out.println(book);
	        
	        Collections.sort(books, new BookComparator.BookPublicationYearComparator());
	        System.out.println("Books Sorted by Publication Year:");
	        for (BookComparatorApp book : books)
	            System.out.println(book);
	        
	        Collections.sort(books, BookComparator.getAuthorTitlePriceComparator());
	        System.out.println("Books Sorted by Author, then Title, then Price:");
	        for (BookComparatorApp book : books)
	            System.out.println(book);
	        
	        Collections.sort(books, BookComparator.getPublicationYearPriceAuthorComparator());
	        System.out.println("Books Sorted by Publication Year, then Price, then Author:");
	        for (BookComparatorApp book : books)
	            System.out.println(book);
	        
	      
	    }
	}

