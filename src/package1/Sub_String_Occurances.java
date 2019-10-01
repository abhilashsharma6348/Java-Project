package package1;

public class Sub_String_Occurances {
  public static void main(String[]args) {
	  String s1 = "GeeksforGeeks is a Geeks computer science plateform";
	  String sub = "Geeks";
	  String []s2 = s1.split(sub);
//	  for(String s:s2)
//	      System.out.println(s);
	  System.out.println(s2.length-1);
  }
}
