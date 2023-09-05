package Function_5;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		//1
		System.out.print("수를 입력하세요 : ");
		int num = scan.nextInt();
		
		System.out.println(getSumUntil100(num));
		
		//2
		System.out.print("5개의 수를 입력하세요 : ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int e = scan.nextInt();
		
		printMin(a, b, c, d, e);
		
		//3
		System.out.print("수를 입력하세요 : ");
		int num1 = scan.nextInt();
		
		System.out.println(isPrimeNumber(num1));
		
		
	}
	//메서드 만드는 곳
	//1
	public static int getSumUntil100(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
			if (sum > 100) {
				break;
			}
		}
		return sum;
	}
	
	//2
	public static void printMin(int a, int b, int c, int d, int e) {
		int min = a;
		if (min > b) {
			min = b;
		}
		if (min > c) {
			min = c;
		}
		if (min > d) {
			min = d;
		}
		if (min > e) {
			min = e;
		}
		System.out.println("최소값은 : " + min);
	}
	
	//3
	public static boolean isPrimeNumber(int num) {
		if (num % 2 != 0 && num % 3 != 0) {
			return true;
		}
		return false;
	}
	
	
	
}
