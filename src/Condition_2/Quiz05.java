package Condition_2;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {

		//5. 종합문제 
		Scanner scan = new Scanner(System.in);
		
		//1번
		System.out.println("두 점수를 입력하세요 : ");
		int score1 = scan.nextInt();
		int score2 = scan.nextInt();
		
		double average = (score1 + score2) / 2.0;
		
		if (average >= 70) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		
		//2번
		System.out.println("세 개의 수를 입력하세요 : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		int max = num1;
		if (max < num2) {
			max = num2;
		}
		if (max < num3) {
			max = num3;
		}
		System.out.println(max);
		
		//3번
		System.out.println("점수1 : ");
		int score3 = scan.nextInt();
		System.out.println("점수2 : ");
		int score4 = scan.nextInt();
		
		average = (score3 + score4) / 2.0;
		
		if (score3 <= 50 || score4 <= 50) {
			System.out.println("과락");
		} else if (average >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		//4번
		System.out.println("연도 : ");
		int year = scan.nextInt();
		
		if (year % 400 == 0) {
			System.out.println("윤년");
		} else if (year % 100 == 0) {
			System.out.println("평년");
		} else if (year % 4 == 0) {
			System.out.println("윤년");
		} else {
			System.out.println("평년");
		}
		
		//5번
		System.out.println("윷 상태를 입력하세요 : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		int sum = a + b + c + d;
		
		if (sum == 0) {
			System.out.println("모");
		} else if (sum == 1) {
			System.out.println("도");
		} else if (sum == 2) {
			System.out.println("개");
		} else if (sum == 3) {
			System.out.println("걸");
		} else if (sum == 4) {
			System.out.println("윷");
		}
		
	}

}
