package com.sujata.demo;

import com.sujata.entity.Book;

public class ThickBookPredicate implements BookPredicate {

	@Override
	public boolean checkBook(Book book) {
		
		return book.getNoOfPages()>1500;
	}

}
