package ex2_object;
/*
hashCode : 메서드 : JVM이 객체를 구분하기 위한 고유값(예를 들면 참조값)
- 두객체의 해시코드 값이 동일한 경우는 하나의 객체로 인식
- 물리적으로 같은 객체  판단 - 실제로 같은 객체
- 논리적으로 같은 객체  판단 - 내용기준으로 같은 객체인지 판단해야 할 필요성 있음

논리적으로 같은 객체  판단
- equals 메서드의 결과가 참
- hashCode 메서드의 값이 같은 경우

권장사항
- equals 메서드 오버라이딩을 하는 경우 hashCode 메서드 함께 오버라이딩하기
*/
class HashCode{
	int value;

	public HashCode(int value) {
		super();
		this.value = value;
	}

	@Override
	public int hashCode() {
		return value;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof HashCode) {
			HashCode h = (HashCode)obj;
			return value ==  h.value;
		} else {
			return false;
		}
	}
	
}
public class HashCodeEx1 {
	public static void main(String[] args) {
		// 논리적으로 같은 객체 판단
		String s1 = new String("abc");
		String s2 = new String("abc");
		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s1.equals(s2) : " + (s1.equals(s2))); // 내용이 같다.
		System.out.println("s1.hashCode() : " + s1.hashCode());
		System.out.println("s2.hashCode() : " + s2.hashCode());
		System.out.println("System.identityHashCode(s1) : " + System.identityHashCode(s1));
		System.out.println("System.identityHashCode(s2) : " + System.identityHashCode(s2));
		
		HashCode h1 = new HashCode(10);
		HashCode h2 = new HashCode(10);
		System.out.println("h1 == h2 : " + (h1 == h2));
		System.out.println("h1.equals(h2) : " + (h1.equals(h2)));
		System.out.println("h1.hashCode() : " + h1.hashCode());
		System.out.println("h2.hashCode() : " + h1.hashCode());
		System.out.println("System.identityHashCode(s1) : " + System.identityHashCode(h1));
		System.out.println("System.identityHashCode(s2) : " + System.identityHashCode(h2));
	}
}
