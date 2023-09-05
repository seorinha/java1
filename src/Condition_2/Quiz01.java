package Condition_2;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		//1. if문과 비교 연산자
		
		Scanner scan = new Scanner(System.in);
		//1번
		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		
		if (num > 10) {
			System.out.println("10보다 큽니다.");
		} else if (num < 10) {
			System.out.println("10보다 작습니다.");
		} else {
			System.out.println("10과 같습니다.");
		}
		
		//2번
		System.out.print("두개의 수를 입력하세요 : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if (a > b) {
			System.out.println("a가 더 큽니다.");
		} else if (b > a) {
			System.out.println("b가 더 큽니다.");
		} else {
			System.out.println("a와 b는 같습니다.");
		}
		
		System.out.println();
		
		//3번
		System.out.print("성적을 입력하세요 : ");
		int score = scan.nextInt();
		
		if (score >= 70) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		
		System.out.println();
		
		//4번
		System.out.print("수를 입력하세요 : ");
		int num1 = scan.nextInt();
		
		if (num1 % 2 == 0) {
			System.out.println("짝수");
		} else if (num1 == 0) {
			System.out.println("0");
		} else {
			System.out.println("홀수");
		}
		
		
		
	}

}
