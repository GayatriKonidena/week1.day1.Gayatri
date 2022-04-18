package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum = 0;
		int secNum = 1;
		int range = 8;
		int i;
		System.out.println(firstNum);
		System.out.println(secNum);
		
		for (i=1; i <= range-1; ++i) {
			
			int sum = firstNum+secNum;
			System.out.println(sum);
			firstNum=secNum;
			secNum=sum;
			
		}
	}
}