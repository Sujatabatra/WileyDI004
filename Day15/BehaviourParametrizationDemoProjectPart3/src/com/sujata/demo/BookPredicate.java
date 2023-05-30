package com.sujata.demo;

import com.sujata.entity.Book;
/*
 * Functional interface in an interface with exactly one abstract meth0d
 */

@FunctionalInterface
public interface BookPredicate {

	boolean checkBook(Book book);
	
}
