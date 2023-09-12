package two_demensional_array_7;

public class ex01 {

	public static void main(String[] args) {

		//7-1. 2차원 배열 사용법
		/*
		 * 2차원 배열
		 * 바깥쪽: 행, 안쪽:열
		 */
		int [][] scores = {{89, 93, 91}, {91, 82, 72}, {98, 93, 94}, {65, 63, 71}, {45, 50, 48}};
		System.out.println("3번째 학생의 두번째 점수는:" + scores[2][1]);
		System.out.println("2번째 학생의 찻번째 점수는:" + scores[1][0]);
		System.out.println("5번째 학생의 세번째 점수는:" + scores[4][2]);
		
		System.out.println();
		
		//반복문으로 2차원 배열 값 출력
		for (int i = 0; i < scores.length; i++) { // 학생수
			for (int j = 0; j < scores[i].length; j++) { //시험과목 수
				System.out.print((i + 1) + "번째 학생의 " + (j + 1) + "번째 점수는" + scores[i][j] + "\n");
			}
		}
		System.out.println();
		
		//학생들의 평균점수 구하기
		for (int i = 0; i < scores.length; i++) { //학생 수
			int sum = 0; //한 학생의 점수 총합
			for (int j = 0; j < scores[i].length; j++) { // 학생 당 점수들
				sum += scores[i][j];
			}
			double average = sum / (double)scores[i].length;
			System.out.println((i + 1) + "번째 학생의 평균 점수는 " + average + "점");
		}
		
		
		
	}

}
