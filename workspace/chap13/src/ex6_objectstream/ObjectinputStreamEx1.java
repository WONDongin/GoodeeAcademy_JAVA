package ex6_objectstream;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;

/*
ObjectinputStream를 이용하여 객체를 지정한 Object.ser 파일을 읽고 복원
*/
public class ObjectinputStreamEx1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// ois 스트림 : object.ser 파일에서 객체를 읽을 수 있는 스트림
		ObjectInputStream ois = new ObjectInputStream(new  FileInputStream("object.ser"));
		// Customer c1 = (Customer) ois.readObject(); // Customer 클래스로 형변환
		// Customer c2 = (Customer) ois.readObject(); 
		Object c1 = ois.readObject(); // readObject() 메서드의 리턴타입: Object임
		Object c2 = ois.readObject(); 
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
