package ex2_super;

public class Child extends Parent{
   int x = 20;	//Child 멤버
   Child() {
	   super();  //매개변수없는 부모 생성자 호출. 생략가능
//	   super(100);
   }
   void method() {
	   int x = 30; //지역변수
	   System.out.println("x="+x);
	   System.out.println("this.x="+this.x);
	   System.out.println("super.x="+super.x);
   }
}