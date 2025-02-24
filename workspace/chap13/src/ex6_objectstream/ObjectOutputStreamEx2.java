package ex6_objectstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.jar.Attributes.Name;

/*
상속관계에서의 직렬화
 
*/
class UserInfo{
	protected String name;
	protected String password;
	public UserInfo() {}
	public UserInfo(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	@Override
	public String toString() {
		return name + "," + password;
	}

	
}
@SuppressWarnings("serial")
class User extends UserInfo implements Serializable{
	private int age;

	public User(String name, String password, int age) {
		super(name, password);
		this.age = age;
	}

	public String toString() {
		return name + "," + password + "," +  age;
	}
	
	// 무모객체의 멤버를 직렬화에 추가하기
	private void writeObject(ObjectOutputStream out) throws IOException{
		out.writeUTF(name);
		out.writeUTF(password);
		out.defaultWriteObject();
	}
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
		name = in.readUTF();
		password = in.readUTF();
		in.defaultReadObject();
	}
	
}
// User객체("홍길동", "1234", 20)
// User객체("김삿갓", "3456", 30)
// 2개의 객체를 object2.ser 파일로저장
public class ObjectOutputStreamEx2 {
	public static void main(String[] args) throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object2.ser"));

		User u1 = new User("홍길동", "1234", 20);
		User u2 = new User("김삿갓", "3456", 30);
		oos.writeObject(u1);
		oos.writeObject(u2);
		System.out.println(u1);
		System.out.println(u2);
		oos.close();	
		
	}
}
