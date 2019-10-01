package package1;

public class Ques {
   public static int searchVarCount(int[] arr,int k) {
	   int count = 0;
	   for(int i=0;i<arr.length;i++) {
		   if(arr[i]<k)
			   count++;
	   }
	   return count;
   }
}
