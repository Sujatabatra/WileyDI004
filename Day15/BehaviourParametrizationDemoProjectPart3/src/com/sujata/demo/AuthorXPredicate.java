package com.sujata.demo;

import com.sujata.entity.Book;

public class AuthorXPredicate implements BookPredicate {

	@Override
	public boolean checkBook(Book book) {
		
		return book.getAuthorName().equals("Author X");
	}

}
