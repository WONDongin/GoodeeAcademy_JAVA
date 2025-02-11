package ex6_final;
/*
 * final 제어자 : 변경 불가의 의미 
 * final 클래스(종단클래스) : 상속불가클래스. 다른클래스의 부모클래스가 안됨. 
 * 
 * String, Math 클래스가 final 클래스
 */
class A {};
public final class FinalClass extends A{}
//class SubClass extends FinalClass {}

//class MyString extends String {}