package two_demensional_array_7;

public class quiz01 {

	public static void main(String[] args) {

		//7-1 2차원 배열 기본 사용법 
		int[][] scores = {
			    {89, 93, 91, 93, 92, 78, 90, 90, 93, 90},
			    {91, 82, 72, 98, 92, 87, 77, 87, 74, 88},
			    {98, 93, 94, 91, 97, 94, 91, 96, 98, 90},
			    {65, 63, 57, 87, 88, 92, 78, 85, 100, 68},
			    {45, 50, 48, 63, 67, 58, 40, 66, 47, 64}
			};
		
		//1
		
		 for (int i = 0; i < scores.length; i++) {
			 int sum = 0;
			 for (int j = 0; j < scores[i].length; j++) {
				 sum += scores[i][j];
			 }
			 double average = sum / (double)scores[i].length;
			 System.out.println((i + 1) + "번째 학생의 평균은 " + average);
		 }
		
		 System.out.println();
		 
		 //2
		 for (int i = 0; i < scores.length; i++) {
			 int max = 0;
			 for (int j = 0; j < scores[i].length; j++) {
				 if (max < scores[i][j]) {
					 max = scores[i][j];
				 }
			 }
			 System.out.println((i + 1) + "번째 학생의 최고점은" + max);
		 }
		
		//3
		 int maxIndex = 0;
		 double maxAverage = 0;
		for (int i = 0; i < scores.length; i++) { //학생수
			int sum = 0; 
			for (int j = 0; j < scores[i].length; j++) { //한 학생의 과목 수
				sum += scores[i][j];
			}
			double average = sum / (double)scores[i].length; 
			if (maxAverage < average) {
				maxAverage = average;
				maxIndex = i;
			} 
		}
		System.out.println("평균이 가장 높은 학생은 " + maxIndex + "번째 학생이고, 평균 점수는 " + maxAverage);
		
		
		//4
		int maxScore = 0;
		maxIndex = 0;
		for (int i = 0; i < scores.length; i++) { //학생 수
			if (maxScore < scores[i][3]) {
				maxScore = scores[i][3];
				maxIndex = i;
			}
		}
		System.out.println("4번째 과목의 최고 성적자는 " + maxIndex + "번째 학생이고, 점수는 " + maxScore);
		
		
		//5
		maxAverage = 0;
		maxIndex = 0;
		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			for (int j = 3; j <= 7; j++) {
				 sum += scores[i][j];
			}
			double average = sum / 5.0;
			if (maxAverage < average) {
				maxAverage = average;
				maxIndex = i;
			}
		}
		System.out.println("3~7 과목 평균이 가장 높은 학생은 " + (maxIndex + 1) + "번째 학생이고, 평균은 " + maxAverage);
		
		
	}

}
