package Function_5;

public class Ex02 {

	public static void main(String[] args) {

		//메서드 만들기
		//1. 어떤 함수를 만들지 메서드 명을 짓는다(동사)
		//2. input을 무엇을 받을지 생각한다
		//3. output을 무엇으로 돌려줄지 생각한다
		//4. 구현한다
		
		//메서드를 사용하는 곳
		int x = 30;
		int y = 50;
		int result = sum(x, y); //전달인자(argument)
		System.out.println(result); //80
		System.out.println(sum(x, y)); //80
		
		printHelloworld();
		
	}

	//메서드 만드는 곳
	// static: 정적변수.static메서드가 다른 메서드를 부르는 경우
	//메모리에 없으면 참조할 수 없기 때문에 static으로 정의한다
	public static int sum(int a, int b) { //매개변수 (parameter)
		return a + b;
	}
	
	public static void printHelloworld() { 
		System.out.println("Hello world");
		return; //생략 가능, return을 만나면 메서드가 종료된다
	}

}
