package Condition_2;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {

		//4. switch문
		Scanner scan = new Scanner(System.in);
		
		System.out.print("월을 입력하세요 : ");
		int month = scan.nextInt();
		
		switch (month) {
		case 3:
		case 4:
		case 5:
				System.out.println("봄");
				break;
		case 6:
		case 7:
		case 8:
				System.out.println("여름");
				break;
		case 9:
		case 10:
		case 11:
				System.out.println("가을");
				break;
		case 12:
		case 1:
		case 2:
				System.out.println("겨울");
				break;
		default:
				System.out.println("월을 잘못 입력하셨습니다.");
	
		}
		
	}

}
