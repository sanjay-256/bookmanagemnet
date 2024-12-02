package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity

public class Bookentity {

	@Id
	 private int bookId;
	 private String title;
	 private String author;
	 private int isbn;
	 
	 @Enumerated(EnumType.STRING)
	    private Genre genre;
	 
	 private String publisher;
	 private LocalDate publicationDate;
	 private int price;
	 private int costprice;
	 private int stockQuantity;
	 private String language;
	 private int edition;
	 private int pageCount;
	 
	 @Enumerated(EnumType.STRING)
	 private BookFormat bookFormat;

	 
	 @Lob
	 private String description;

	 private String bookCoverImage;
	 

	 enum Genre {
		    FICTION, NON_FICTION, SCIENCE, BIOGRAPHY, FANTASY, MYSTERY
		}
	 
	 enum BookFormat {
		    HARDCOVER, PAPERBACK, EBOOK
		}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public LocalDate getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(LocalDate publicationDate) {
		this.publicationDate = publicationDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCostprice() {
		return costprice;
	}

	public void setCostprice(int costprice) {
		this.costprice = costprice;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public BookFormat getBookFormat() {
		return bookFormat;
	}

	public void setBookFormat(BookFormat bookFormat) {
		this.bookFormat = bookFormat;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBookCoverImage() {
		return bookCoverImage;
	}

	public void setBookCoverImage(String bookCoverImage) {
		this.bookCoverImage = bookCoverImage;
	}

	public Bookentity(int bookId, String title, String author, int isbn, Genre genre, String publisher,
			LocalDate publicationDate, int price, int costprice, int stockQuantity, String language, int edition,
			int pageCount, BookFormat bookFormat, String description, String bookCoverImage) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.genre = genre;
		this.publisher = publisher;
		this.publicationDate = publicationDate;
		this.price = price;
		this.costprice = costprice;
		this.stockQuantity = stockQuantity;
		this.language = language;
		this.edition = edition;
		this.pageCount = pageCount;
		this.bookFormat = bookFormat;
		this.description = description;
		this.bookCoverImage = bookCoverImage;
	}

	public Bookentity() {
		super();
	}

	 	
	
}
