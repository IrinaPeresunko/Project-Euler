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
		int a = 0,b = 0,c = 0;
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
