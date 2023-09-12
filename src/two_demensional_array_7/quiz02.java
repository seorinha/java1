package two_demensional_array_7;

public class quiz02 {

	public static void main(String[] args) {

		//7-2. 2차원 배열 다루기
		//1
		int[][] arr1 = new int[2][3];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = 10;
			}
		}
		
		printArray(arr1); 
		System.out.println();
		
		//2
		int[][] arr2 = new int[3][4];
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = j + 1;
			}
		}
		printArray(arr2);
		System.out.println();
		
		
		//3
		int[][] arr3 = new int[3][3];
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				arr3[i][j] = i + 1;
			}
		}
		printArray(arr3);
		System.out.println();
		
		//4
		int[][] arr4 = new int[5][5];
		for (int i = 0; i < arr4.length; i++) {
			for (int j = 0; j < arr4[i].length; j++) {
				arr4[i][j] = 0;
				if (i == 2 || j == 2) {
					arr4[i][j] = 1;
				} 
			}
		}
		printArray(arr4);
		
		//5
		int[][] arr5 = new int[3][3];
		for(int i = 0; i < arr5.length; i++) {
			for (int j = 0; j < arr5[i].length; j++) {
				arr5[i][j] = (i * 3) + (j + 1);
				
			}
		}
		printArray(arr5);
		
		//6
		int[][] arr6 = new int[3][3];
		for (int i = 0; i < arr6.length; i++) {
			for (int j = 0; j < arr6[i].length; j++) {
				arr6[i][j] = (i + 1) + (j * 3);
			}
		}
		printArray(arr6);
		
		
	}//main 

	public static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}//class
