package DAOImple;

import java.util.*;
import java.util.stream.Stream;

import DAO.BookInterface;
import Model.Book;

public class BookImple implements BookInterface{
	List<Book> book = new ArrayList<Book>();
	Scanner sc = new Scanner(System.in);
	public BookImple() {
		book.add(new Book("101","Let us C",200));
		book.add(new Book("102","Oops C++",250));
		book.add(new Book("103","Java Complete Reference",300));
		book.add(new Book("104","Ad Java",350));
	}

	@Override
	public List<Book> getBookDetails() {
		return book;
	}

	@Override
	public void deleteBook(String id) {
		Iterator<Book> it = book.iterator();
		while(it.hasNext()){
			Book b = it.next();
			if(b.getId().equals(id)){
				it.remove();
				System.out.println("Deleted");
			}
		}
	}

	@Override
	public void insertBook(Book books) {
		if(book.stream().anyMatch((Book b) -> b.getId() == books.getId() ))
			System.out.println("Already Existed");
		else{
			book.add(books);
			System.out.println("Inserted");
		}
	}

	@Override
	public void updateBook(String id) {
		Iterator<Book> it = book.iterator();
		while(it.hasNext()){
			Book b = it.next();
			if(b.getId().equals(id)){
				System.out.println("Enter Book Name");
				String name = sc.next();
				b.setName(name);
				System.out.println("Updated");
			}
		}
	}

	@Override
	public void getBookDetail(String id) {
		book.stream().filter(b -> b.getId().equals(id)).forEach((b) -> {System.out.println(b.getId() + "  " + b.getName() + "  " + b.getPrice());});
	}
	
}
