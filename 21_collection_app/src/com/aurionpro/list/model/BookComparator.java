package com.aurionpro.list.model;
import java.util.Comparator;

public class BookComparator {
	 public static class BookTitleComparator implements Comparator<BookComparatorApp> {
	        @Override
	        public int compare(BookComparatorApp book1, BookComparatorApp book2) {
	            return book1.getTitle().compareTo(book2.getTitle());
	        }
	    }
	    
	    public static class BookAuthorComparator implements Comparator<BookComparatorApp> {
	        @Override
	        public int compare(BookComparatorApp book1, BookComparatorApp book2) {
	            return book1.getAuthor().compareTo(book2.getAuthor());
	        }
	    }
	    
	    public static class BookPriceComparator implements Comparator<BookComparatorApp> {
	        @Override
	        public int compare(BookComparatorApp book1, BookComparatorApp book2) {
	            return Double.compare(book1.getPrice(), book2.getPrice());
	        }
	    }
	    
	    public static class BookPublicationYearComparator implements Comparator<BookComparatorApp> {
	        @Override
	        public int compare(BookComparatorApp book1, BookComparatorApp book2) {
	            return Integer.compare(book2.getPublicationYear(), book1.getPublicationYear());
	        }
	    }
	    
	    public static Comparator<BookComparatorApp> getAuthorTitlePriceComparator() {
	        return new BookAuthorComparator()
	            .thenComparing(new BookTitleComparator())
	            .thenComparing(new BookPriceComparator());
	    }
	    
	    public static Comparator<BookComparatorApp> getPublicationYearPriceAuthorComparator() {
	        return new BookPublicationYearComparator()
	            .thenComparing(new BookPriceComparator())
	            .thenComparing(new BookAuthorComparator());
	    }
	

}
