package Loop_3;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {

		//4. 종합문제
		Scanner scan = new Scanner(System.in);
		//1
		System.out.print("수를 입력하세요 : ");
		int num = scan.nextInt();
		
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		//2
		System.out.print("수를 입력하세요 : ");
		int num1 = scan.nextInt();
		
		sum = 1;
		for (int i = 1; i <= num1; i++) {
			sum *= i;
		}
		System.out.println(sum);
		
		//3
		System.out.println("수를 입력하세요 : ");
		int num2 = scan.nextInt();
		
		for (int i = 1; i <= num2; i++) {
			if (num2 % i == 0) {
				System.out.println(i + " ");
			}
		}
		
		
		
	}

}
