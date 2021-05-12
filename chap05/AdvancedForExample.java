package chap05;

public class AdvancedForExample {

	public static void main(String[] args) {
		int[] scores = { 95, 71, 84, 93, 33 };
		
		int sum = 0;
		for (int score : scores) {
			sum = sum + score;
		}
		
		System.out.println("점수 총합 = " + sum);
	}

}
