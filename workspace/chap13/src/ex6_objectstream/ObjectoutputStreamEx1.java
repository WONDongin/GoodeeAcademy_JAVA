package ex6_objectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


/*
ObjectOutputStream 예제
1. 객체를 외부로 전송할 수 있는 스트림
2. 외부 전송이 가능한 객체는 반드시 Serializable 인터페이스의 구현 클래스 여야함.
 	=> 직렬화라 한다.
 	=> Serializable 인터페이스를 구현하지 않은 객체를 외부 전송시 NotSerializableException 예외발생
3. ObjectOutputStream 으로 전송된 객체는 ObjectInputStream 객체로 읽음

Serializable 인터페이스의 멤버가 없다.

*/
@SuppressWarnings("serial") // warring 표시 안함
class Customer implements Serializable{
	// private static final long serialVersionUID = 1L;
	private String name;
	// transient : 직렬화 대상의 객체에서 해당 멤버는 제외
	private transient int age;
	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + "," + age;
	}
}
public class ObjectoutputStreamEx1 {	
	public static void main(String[] args) throws IOException {
		// fos 스트림의 목적지 : object.ser 파일
		FileOutputStream fos = new FileOutputStream("object.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Customer c1 = new Customer("원동인", 30);
		Customer c2 = new Customer("홍길동", 20);
		System.out.println(c1);
		System.out.println(c2);
		
		oos.writeObject(c1);// c1 객체를 object.ser파일로 전송  
		oos.writeObject(c2);// c2 객체를 object.ser파일로 전송  
		oos.close();
	}
}
