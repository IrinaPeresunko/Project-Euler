package projectEuler;
/*
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a2 + b2 = c2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class Task9 {

	public static boolean isPythagoreanTriplet(int a,int b,int c){
		boolean isPythagoreanTriplet = false;
		if(a<b && b<c && a<c){
			if(Math.pow(a, 2)+Math.pow(b, 2)==Math.pow(c, 2)){
				isPythagoreanTriplet = true;
			}
		}
		return isPythagoreanTriplet;
	}
	public static void main(String[] args) {
		int a = 0;
		int b = a+1;
		int c = b+1;
		
//		int resultSum = 0;
//		int answer = 1;
//		int temp=0;
//		while(temp<=1000){
//			if((a+b+c)==1000){
//				resultSum = a+b+c;
//				answer = a*b*c;
//			}
//			temp = a+b+c;
//			System.out.println(temp);
//			a++;b++;c++;
//		}
//		System.out.println("a = "+a+"; b = "+b+"; c = "+c);
//		System.out.println("sum = "+resultSum);
//		System.out.println("answer = "+ answer);
		
		boolean flag = false;
		for(a=0;a<1000 && flag!=true;a++){
			for(b=0;b<1000 && flag!=true;b++){
				for(c=0;c<1000 && flag!=true;c++){
					if(isPythagoreanTriplet(a,b,c)){
						if((a+b+c)==1000){
							flag = true;
							break;
						}
					}	
				}
				if(flag==true) break;
			}
			if(flag==true) break;
		}
		System.out.println("a = "+a+"; b = "+b+"; c = "+c);
		System.out.println("sum = "+(a+b+c));
		System.out.println("answer = "+(a*b*c));	
	}
}
