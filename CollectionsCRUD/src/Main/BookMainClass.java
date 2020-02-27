package Main;

import DAO.BookInterface;
import DAOImple.BookImple;
import Model.Book;

import java.util.*;

public class BookMainClass extends BookImple{

	public static void main(String[] args) {
		
		System.out.println("Choose one of the following" + "\n" + "1. getAllBooks" + "\n" + "2. getonebook" + "\n" + "3. Insertbook" + "\n" + "4. deleteBook" + "\n" + "5. updateBook");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		BookInterface bi = new BookImple();
		
		int input = sc.nextInt();
		
		switch(input){
		case 1:
			List<Book> list = bi.getBookDetails();
			list.forEach(b -> System.out.println(b.getId() + "  " + b.getName() + "   " + b.getPrice()) );
			break;
		case 2:
			System.out.println("Enter the record id");
			String s = sc.next();
			bi.getBookDetail(s);
			break;
		case 3:
			System.out.println("Enter id");
			String id = sc.next();
			System.out.println("Enter Book Name");
			String name = sc.next();
			System.out.println("Enter price");
			int price = sc.nextInt();
			bi.insertBook(new Book(id,name,price));
			break;
		case 4:
			System.out.println("Enter book id");
			String id1 = sc.next();
			bi.deleteBook(id1);
			break;
		case 5:
			System.out.println("Enter book id");
			String id2 = sc.next();
			bi.updateBook(id2);
			break;
		default:
			System.out.println("Sorry wrong input");
			break;
		}
		
		
	}

}
