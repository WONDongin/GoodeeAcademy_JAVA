package test;
/*
다음 결과가 출력되도록 동물(Animal)클래스와 구동클래스(Test2)를 구현하기       
구동클래스에서 출력은 Animal 클래스에서 이용

 동물클래스(Animal)
    멤버변수 : 이름(name), 나이(age)
    멤버메서드: eat() ;
         기능 : "맛있게 얌얌" 출력
[결과]
     이름(name):원숭이
     나이(age):20
     맛있게 얌얌   
*/
class Animal{
	String name;
	int age;
	    
	Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
	
	void eat() {
		System.out.println("맛있게 얌얌");
	}
	
	public String toString() {
		return "이름(name):" + name + "\n나이(age):" + age;
	}
}
public class Test02 {
	public static void main(String[] args) {
		Animal monkey = new Animal("원숭이", 20);
		System.out.println(monkey);
		monkey.eat();
	}
}
