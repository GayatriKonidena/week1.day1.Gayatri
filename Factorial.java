package week1.day1;

public class Factorial {
	public static void main(String[] args) {
		int value=5;
		int fact=1;
		for (int i=1;i<=value;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
