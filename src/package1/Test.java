package package1;
import java.util.*;

public class Test {
	public static int balancedSum(List<Integer> sales){
		
		int sum1=0;
	    for(int i=0;i<sales.size();i++) {
	      sum1=sum1+sales.get(i);
	      int sum2=0;
	    	for(int j=sales.size()-1;j>=sales.size()-i;j--) {
	    		sum2+=sales.get(j);
	    		if(sum1==sum2)
	    			return j;
	    	}
	    }
	    return 0;
	}
	
	public static String[] udf12(String[]s1, String []s2) {
		int len = s1.length;
		String []s3 = new String[len];
		for(int i=0;i<len;i++) {
			s3[i] = s1[i]+s2[i];
		}
		return s3;
	}
	
	public static void main(String[]args) {
	   String []s1 = {"AK","MK","DF"};
	   String []s2 = {"Sharma","Jain","Porwal"};
	   String []s3 = udf12(s1,s2);
	   for(String s:s3)
	      System.out.println(s);
	}
}
