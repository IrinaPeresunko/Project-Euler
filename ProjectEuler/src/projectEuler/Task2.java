package projectEuler;

/*Each new term in the Fibonacci sequence is generated by adding the previous two terms. 
 * By starting with 1 and 2, the first 10 terms will be: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
	By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 * 
 */

public class Task2 {

	public static void main(String[] args) {
		long sum = 2;
		long res=0;
		for(long p=2,next=3;p<4000000 || res<4000000 || next<4000000 ;){
			res = p+next;
			if(res%2==0){
				sum+=res;
			}
			p=next; next=res;
			if((p+next)>4000000) break;
		}
		System.out.println("result="+sum);
	}

}
