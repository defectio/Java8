package chapter05_ReferenceType.sec06_Array.part01_basic;

public class my04_ArrayExample {

	public static void main(String[] args) {
		int sum = 0 ;
		double avg = 0.0;
		
		int[] scores = {95, 99, 86};
		
		for(int i=0 ; i<scores.length ; i++) {
			sum += scores[i];
		}
		
		avg = (double) sum / scores.length;
		System.out.println("sum : "+sum);
		System.out.println("avg : "+avg);
		
	}

}
