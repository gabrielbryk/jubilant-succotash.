package main;

public class SumOfPrimes {

	public static void main(String[] args) {
		long sum = 0;
		for(long i=2;true;i++){
			if(isPrime(i)){
				if(i >= 2000000){
					System.out.println(sum);
					break;
				}
				sum += i;
				//System.out.println(i);
			}
		}

	}
	static boolean isPrime(long n) {
		if(n == 2) return true;
	    if (n%2==0) return false;
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
}