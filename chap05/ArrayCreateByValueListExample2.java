package chap05;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int[] scores;
		// 초기화 후 값을 넣을 시 new 연산자 사용해야 한다. 
		scores = new int[] {83, 90, 87 };
		int sum1 = 0;
		for (int i = 0; i < 3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);
		
		int[] list = new int[] {88, 99, 100};
		int sum2 = add(list);
		System.out.println("총합 : " + sum2);
	}
	
	
	public static int add(int[] scores) {
		int sum = 0;
		for(int i=0 ; i < 3; i++) {
			sum += scores[i];
		}
		
		return sum;
	}

}
