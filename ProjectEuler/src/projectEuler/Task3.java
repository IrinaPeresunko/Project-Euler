package projectEuler;

/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */

public class Task3 {
	static boolean prime(long n){ 
	    for(long i=2;i<=Math.sqrt(n);i++)
	        if(n%i==0)
	            return false;
	    return true;
	}
	public static void main(String[] args){
		long n = 600851475143l;
		long result=0;
		int limitOfValueOfPrimeNumber = (int) Math.sqrt(n);
		long temp=limitOfValueOfPrimeNumber;
		boolean flag = false;
		while(flag!=true && temp>0){
			if(prime(temp)){
				if(n%temp==0){
					result=temp;
					flag=true;
				}
				else{
					temp--;
				}
			}
			else{
				temp--;
			}
		}
		System.out.println("result = "+result);
	}
}
