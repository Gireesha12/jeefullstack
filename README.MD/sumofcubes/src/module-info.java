/**
 * 
 */
/**
 * @author AGIRISHA
 *
 */
import java.util.*;
class SumOfCubes {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=0,c=1;
		while(n%10!=0) {
			a=n%10;
			c=a*a*a;
			b=b+c;
			n=n/10;
		}
		System.out.println(b);
	}
}