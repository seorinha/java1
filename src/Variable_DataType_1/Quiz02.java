package Variable_DataType_1;

public class Quiz02 {

	public static void main(String[] args) {

		// 2. 변수와 자료형 및 산술 연산자
		
		//1번
		int score1 = 90;
		int score2 = 80;
		char grade1 = 'A';
		char grade2 = 'B';
		double point1 = 4.0;
		double point2 = 3.0;
		System.out.println("시험 성적이 " + score1  + "점 이상이면 " + grade1 + "학점이고 평점은 " + point1 + " 입니다.");
		System.out.println("시험 성적이 " + score2  + "점 이상이면 " + grade2 + "학점이고 평점은 " + point2 + " 입니다.");
		
		System.out.println();
		
		//2번
		int number1 = 33;
		double number2 = 35.325;
		
		double result = number1 * number2;
		System.out.println("두 수의 곱 : " + result);
		
		System.out.println();
		
		//3번
		int day = 943 / 24;
		int hour = 943 % 24;
		System.out.println("943시간은 " + day + "일 " + hour + "시간 입니다.");
		
		System.out.println();
		
		//4번
		int width = 8;
		int height = 9;
		
		int squareArea = width * height;
		double triangleArea = width * height / 2.0;
		
		System.out.println("사각형의 넓이 : " + squareArea);
		System.out.println("삼각형의 넓이 : " + triangleArea);
		
		
	}

}
