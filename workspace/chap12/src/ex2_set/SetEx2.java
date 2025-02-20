package ex2_set;

import java.util.HashSet;
import java.util.Set;
/*
[객체 추가시 중복판단 기준]
1. equals 메서드의 결과가 : true
2. hashCode 메서드의 결과가 같다.
1 % 2 모두 만족하는 경우 : 중복된 객체로 판단

equals, hashCode 메서드를 동시에 오버라이딩 하도록 권장함.

*/
class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "(" + name + ", " + age + ")";
	}
	
	// 2가지 조건 작업시 논리적으로 동등하다.
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person) obj;
			return name.equals(p.name) && age == p.age;
		}else {
			return false;
		}
	}
	
}
public class SetEx2 {
	public static void main(String[] args) {
		Set<Object> set = new HashSet<>();
		// 시스템 생성은 자동 중복판단 o
		set.add(new String("abc"));
		set.add(new String("abc"));
		// 개인 생성은 자동 중복판단 x
		set.add(new Person("홍길동", 10));
		set.add(new Person("홍길동", 20));
		System.out.println(set);
			
	}
}
