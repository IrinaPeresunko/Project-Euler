package projectEuler;
/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */
public class Task7 {

	static boolean prime(long n){ 
	    for(long i=2;i<=Math.sqrt(n);i++)
	        if(n%i==0)
	            return false;
	    return true;
	}
	public static void main(String[] args) {
		long result = 0;
		int counter=0;
		boolean flag = false;
		int i=2;
		while(flag!=true && counter!=10001){
			if(prime(i)){
				counter++;
			}
			if(counter==10001){
				result = i;
				flag = true;
			}
			i++;
		}
		System.out.println("result = "+result);

	}

}
