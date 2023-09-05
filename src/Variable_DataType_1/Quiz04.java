package Variable_DataType_1;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {

		// 4. 입력함수
		Scanner scan = new Scanner(System.in);
		
		//1번
		System.out.print("입력1 : ");
		int num1 = scan.nextInt();
		System.out.print("입력2 : ");
		int num2 = scan.nextInt();
				
		int quotient = num1 / num2;
		int remainder = num1 % num2;
		
		System.out.println("몫 : " + quotient + " 나머지 : " + remainder);
		
		System.out.println();
		
		//2번
		System.out.print("x : ");
		int x = scan.nextInt();
		System.out.print("y : ");
		int y = scan.nextInt();
				
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("x는 " + x + "이고, y는 " + y + "입니다.");
		
		System.out.println();
		
		//3번
		System.out.print("초 : ");
		int second = scan.nextInt();
		
		int minutes = second / 60;
		int second2 = second % 60;
		
		System.out.println(minutes + "분 " + second2 + "초");
		
		System.out.println();
		
		//4번
		System.out.print("입력 : ");
		int number = scan.nextInt();
		
		int thousand = number / 1000; 
		int hundred = (number % 1000) / 100 ;
		int ten = (number % 100) / 10;
		int one = number % 10;
		
		System.out.println(thousand + "\n" + hundred + "\n" + ten + "\n" + one);
		
		System.out.println();
		
		//5번
		System.out.print("입력 : ");
		number = scan.nextInt();
		
		thousand = number / 1000; 
		hundred = (number % 1000) / 100 ;
		ten = (number % 100) / 10;
		one = number % 10;
		
		int sum = thousand + hundred + ten + one;
		
		System.out.println("합계는 " + sum + "입니다.");
		
		
		
		
	}

}
