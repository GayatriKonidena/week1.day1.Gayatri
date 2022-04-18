package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p = 13;
		boolean isPrime = false;
	int mod = p%2 ;
	//System.out.println(mod);
	if (mod==1) {
		System.out.println(p +" is not a prime number");
	}
	else
	{
		System.out.println(p+" is a prime number");
	}

	}

}
