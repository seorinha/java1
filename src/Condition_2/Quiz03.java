package Condition_2;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {

		//3. if-else문과 else문
		Scanner scan = new Scanner(System.in);
		//1번
		System.out.print("정수를 입력하세요 : ");
		int num = scan.nextInt();
		
		if (num < 0) {
			System.out.println("음수입니다.");
		} else if (num > 0) {
			System.out.println("양수입니다.");
		} else {
			System.out.println("0입니다.");
		}
		
		
		//2번
		System.out.print("점수를 입력 하세요 : ");
		int score = scan.nextInt();
		
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		//3번
		System.out.println("bmi 수치를 입력하세요 : ");
		int bmi = scan.nextInt();
		
		if (bmi <= 10) {
			System.out.println("정상");
		} else if (bmi <= 20) {
			System.out.println("과체중");
		} else {
			System.out.println("비만");
		}
		
		
	}

}
