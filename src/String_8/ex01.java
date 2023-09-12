package String_8;

public class ex01 {

	public static void main(String[] args) {
		
		//8-1.
		
		//String 변수에 값 저장하기
		String a = "안녕하세요";
		String b = new String("안녕하세요"); //객체
		String c = new String("안녕하세요");
		String d = "안녕하세요"; //heap영역에 constant pool에 저장되고 재활용이 된다ㅓ(new로 생성 x)
		
		System.out.println(a); //안녕하세요
		System.out.println(b); //안녕하세요
		
		//String끼리 값 비교하기
		// ==으로 비교하는 것은 stack영역에 저장된 주소값을 비교한 것이다
		//String에서 값을 비교하려면 .equals()를 사용해야한다
		System.out.println(a == b); //true
		System.out.println(b == c); //false : 값을 비교한게 아니라 객체의 주소를 비교한것
		System.out.println(a == b); //false
		System.out.println(a.equals(b)); //true
		
	}

}
