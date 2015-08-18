package projectEuler;

/*
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */

public class Task10 {
	static boolean prime(long n){ 
	    for(long i=2;i<=Math.sqrt(n);i++)
	        if(n%i==0)
	            return false;
	    return true;
	}
	public static void main(String[] args) {
		long n=2000000;
		long res=0;

		for(long i=n;i>1;i--){
			if(prime(i)){
				res+=i;
			}
		}
		System.out.println("result="+res);
	}

}
