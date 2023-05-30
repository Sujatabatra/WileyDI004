package com.sujata.entity;

public class Book {

	private int bookId;
	private String bookName;
	private int noOfPages;
	private String authorName;
	private int price;
	
	public Book() {
		
	}

	public Book(int bookId, String bookName, int noOfPages, String authorName, int price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.noOfPages = noOfPages;
		this.authorName = authorName;
		this.price = price;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", noOfPages=" + noOfPages + ", authorName="
				+ authorName + ", price=" + price + "]";
	}
	
	
}
