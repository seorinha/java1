package Nestedloop_4;

public class Quiz01 {

	public static void main(String[] args) {

		//1. 중첩 반복문
		//1
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				System.out.print("(" + i + ", "  + j + ")" + " ");
			}
			System.out.println();
		}
		
		//2
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " X " + j + " = " + (i * j));
			}
		}
		
		//3
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//4
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//5
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j < (2 * i) + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
