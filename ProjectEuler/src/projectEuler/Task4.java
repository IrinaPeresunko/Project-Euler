package projectEuler;


/*
 * A palindromic number reads the same both ways. The largest palindrome made from the product
 * of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Task4 {
	public static long searchMaxPalindrome(long[] array){
		long max = array[0];
		for(int i=0;i<array.length;i++){
			if(max<array[i]){
				max = array[i];
			}
		}
		return max;
	}
	public static boolean isPalindromicNumber(long number){
		boolean flag = false;
		String numb = String.valueOf(number);
		int i=0,j=numb.length()-1;
		boolean res = true;
		while(i<j && res){
			if(numb.charAt(i)==numb.charAt(j)){
				i++;j--;
			}
			else{
				res=false;
			}
		}
		if(res==true){
			flag = true;
		}
		return flag;
	}
	public static void main(String[] args) {
		long[] arr = new long[2500];
		long result=0;
		boolean flag = false;
		int k=0;
		for(int i=999;i>=100;i--){
			for(int j=999;j>=100;j--){
				result = i*j;
				flag = isPalindromicNumber(result);
				if(flag==true){
					arr[k] = result;
					if(k<arr.length-1) k++;
				}
			}
		}
		//System.out.println(Arrays.toString(arr));
		result = searchMaxPalindrome(arr);
		System.out.println("result = "+result);
	}

}
