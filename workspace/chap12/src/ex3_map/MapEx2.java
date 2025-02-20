package ex3_map;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/*
도서정보 조회하기
책의 이름으로 도서 정보를 저장하기 
*/
class Book{
	String title;
	String author;
	int price;
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() {
		return "(" + title + "," + author + "," + price + ")";
	}
	
}
public class MapEx2 {
	static Map<String,Book> books = new HashMap<>();
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			int menu;
			try {
			  System.out.println("1.추가 2.삭제 3.조회 4.검색 0.종료");
			  menu = scan.nextInt();
			  if(menu == 0) {
				  System.out.println("도서관리 프로그램을 종료합니다.");
				  break;
			  }
			  switch(menu) {
			  case 1 : addBook(); break;
			  case 2 : deleteBook(); break;
			  case 3 : printBook(); break;
			  case 4 : findBook(); break;
			  default : System.out.println("잘못된 입력입니다. 0,1,2,3,4 숫자만 가능합니다.");
			  }
			} catch (InputMismatchException e) {
				System.out.println("0,1,2,3,4 숫자만 가능합니다.");
			}
		}
	}
	private static void findBook() {
		System.out.println("제목으로 도서를 검색합니다. 제목을 입력하세요");
		Scanner scan = new Scanner(System.in);
		String title = scan.next();
		Book book = books.get(title);
		if(book == null) 
			System.out.println(title + "도서는 없습니다.");
		else {
			System.out.println(title + "로 조회하신 도서정보입니다.");
			System.out.println(book);
		}
	}
	private static void printBook() {
		System.out.println("도서 목록을 조회합니다.");
		for(Book book : books.values()) {
			System.out.println(book);
		}
	}
	/*
	 * 제목을 입력받아서 books 객체에 해당하는 도서를 제거하기
	 */
	private static void deleteBook() {
		System.out.println("도서를 삭제합니다.");
		Scanner scan = new Scanner(System.in);
		System.out.println("삭제할 도서의 이름을 입력하세요");
		String title = scan.next();
		Book book = books.remove(title);
		if(book != null) {
			System.out.println(book + " 도서가 삭제되었습니다.");
		} else {
			System.out.println(title + " 도서가 없습니다.");
		}
	}
	/*
	 * 제목,저자,가격을 입력받아서 books에 저장하기
	 */
	private static void addBook() {
		System.out.println("도서 추가합니다.");
		Scanner scan = new Scanner(System.in);
		System.out.println("도서의 제목 저자 가격을 입력하세요 ");
		String title = scan.next();
		String author = scan.next();
		int price = scan.nextInt();
		Book book = new Book(title,author,price);
		books.put(title,book);
		System.out.println(book + "도서가 추가되었습니다.");
//		System.out.println(books);
	}
}
