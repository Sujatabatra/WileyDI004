package com.sujata.client;

import java.util.ArrayList;

import com.sujata.demo.AuthorXPredicate;
import com.sujata.demo.BookPredicate;
import com.sujata.demo.BookSearch;
import com.sujata.entity.Book;

public class BookClient {

	public static void main(String[] args) {
		BookSearch bookSearch=new BookSearch();
		
		System.out.println(bookSearch.getAllBook());
		
		System.out.println("=============");
		
		System.out.println(bookSearch.searchBook(new AuthorXPredicate()));
		
		//Anonymous Inner Class
//		BookPredicate bookPredicate=new BookPredicate() {
//			@Override
//			public boolean checkBook(Book book) {
//				return book.getPrice()>2500;
//			}
//		};
//		
		//Lambda
//		BookPredicate bookPredicate=(book)-> {
//				return book.getPrice()>2500;
//			};
			
		BookPredicate bookPredicate=book->book.getPrice()>2500;
	
			
		
//		System.out.println("Expensive Book");
//		System.out.println(bookSearch.searchBook(bookPredicate));
		
		
			ArrayList<Book> expensiveBooks=bookSearch.searchBook(new BookPredicate() {
				@Override
				public boolean checkBook(Book book) {
					
					return book.getPrice()>2500;
				}
			});
		
		
			ArrayList<Book> expensiveBooksusingLambda=bookSearch.searchBook((Book book)-> {	return book.getPrice()>2500;});

		System.out.println("Expensive books : "+expensiveBooks);
	
		//FunctionalInterface var=function body
	}

}
