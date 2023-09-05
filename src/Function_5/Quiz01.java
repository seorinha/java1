package Function_5;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//1
		System.out.print("제곱값을 구할 숫자를 입력하세요 : ");
		int num = scan.nextInt();
		System.out.println(num + "의 제곱은 " + getSquared(num) + "이다.");
		
		//2
		System.out.print("점수를 입력하세요 : ");
		int score1 = scan.nextInt();
		int score2 = scan.nextInt();
		int score3 = scan.nextInt();
		int score4 = scan.nextInt();
		
		System.out.println("평균은 " + getAverage(score1, score2, score3, score4));
		
		//3
		System.out.print("숫자와 나눌 수를 입력하세요 : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		printQuotientRemainder(num1, num2);
		
		//4
		System.out.print("숫자를 입력하세요 : ");
		num = scan.nextInt();
		
		System.out.println(getEvenNumber(num));
		
	}

	//메서드 입력하는 곳
	//1. 
	public static int getSquared(int x) {
		return x * x;
	}
	
	//2
	public static double getAverage(int a, int b, int c, int d) {
		return (a + b + c + d) / 4.0;
	}
	
	//3
	public static void printQuotientRemainder(int num1, int num2) {
		int quotient = num1 / num2;
		int remainder = num1 % num2;
		System.out.println("몫 : " + quotient);
		System.out.println("나머지 : " + remainder);
	}
	
	//4
	public static boolean getEvenNumber(int number) {
		return number % 2 == 0 ? true : false; //삼항조건문
	}
}
