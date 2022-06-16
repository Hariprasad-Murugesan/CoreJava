package week1.day1;

public class Fibonacci {
	public static void main(String[] args) {
		int range =8; 
		int firstNum = 0; 
		int secNum = 1;

		for (int i = 1; i <=range; i++) {
			int sum = firstNum+secNum;
			secNum = firstNum;
			sum = secNum;
			
			
			System.out.println(sum);	
			
		}
	}
}
