package Condition_2;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		//2. if문과 논리 연산자
		Scanner scan = new Scanner(System.in);
		//1번
		System.out.print("두 점수를 입력하세요 : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if (num1 >= 70 && num2 >= 70) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		
		System.out.println();
		
		//2번
		System.out.print("수를 입력하세요 : ");
		int num = scan.nextInt();
		
		if (num % 2 == 0 && num % 3 == 0) {
			System.out.println("2와 3의 공배수입니다.");
		} else {
			System.out.println("공배수가 아닙니다.");
		}
		
		System.out.println();
		
		//3번
		System.out.print("1~10 사이의 수를 입력하세요 : ");
		int num3 = scan.nextInt();
		
		if (num3 < 1 || num3 > 10) {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}

}
