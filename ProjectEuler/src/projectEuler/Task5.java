package projectEuler;
/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Task5 {
	
	public static boolean isDivided(int number){
		boolean result = true;
		int i=1;
		while(result && i<=20){
			if(number%i!=0){
				result = false;
			}
			i++;
		}
		return result;
	}
	public static void main(String[] args) {
		boolean flag = false;
		int result = 0,i=20;
		while(!flag){
			result=i;
			flag = isDivided(i);
			i++;
		}
		System.out.println("result="+result);
	}

}
