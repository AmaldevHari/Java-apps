import java.math.BigInteger;
import java.util.ArrayList;

public class EvenFibSum {
	static String FibSum(int a) {
		
		ArrayList<BigInteger> fibs=new ArrayList<BigInteger>();
		fibs.add(new BigInteger("1"));
		fibs.add(new BigInteger("1"));
		int start=2;
		while(fibs.get(fibs.size()-1).compareTo((new BigInteger("4000000")))<1) {
			fibs.add(fibs.get(start-1).add(fibs.get(start-2)));
			start++;
		}
		ArrayList<BigInteger> sumFib=new ArrayList<BigInteger>();
		int start1=0;
		BigInteger two=new BigInteger("2");	BigInteger zero=new BigInteger("0");
		while(start1<start) {
			if(((fibs.get(start1)).remainder(two)==zero)){
				sumFib.add(fibs.get(start1));
			}
			start1++;
		}
		int elements=sumFib.size();
		int start2=0;
		BigInteger sum=new BigInteger("0");
		while (start2<elements) {
			sum.add(sumFib.get(start2));
			start2++;
		}
		return ""+sum.toString();
		
	}
public static void main(String[] args) {
	System.out.print(FibSum(3));
}
}
