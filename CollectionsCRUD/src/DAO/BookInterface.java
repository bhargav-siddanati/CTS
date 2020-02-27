package DAO;

import java.util.*;

import Model.Book;

public interface BookInterface {
	List<Book> getBookDetails();
	void deleteBook(String id);
	void insertBook(Book book);
	void updateBook(String id);
	void getBookDetail(String id);
}
