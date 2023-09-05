package Loop_3;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		//2. for문
		//1번
		for (int i = 35; i <= 40; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//2번
		for (int i = 5; i >= -5; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//3번
		for (int i = 3; i < 50; i += 3) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//4번
		int count = 0;
		for (int i = 7; i <= 100; i += 7) {
				count++;
		}
		System.out.println("7의 배수는 : " + count);
		
		//5번
		Scanner scan = new Scanner(System.in);
		System.out.print("단수를 입력하세요 : ");
		int num = scan.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));
		}
		
		
	}

}
