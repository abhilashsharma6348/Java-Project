package package1;

import java.io.FileReader;

public class MyFileReader {
  public static void main(String[]args) {
	  try {
			FileReader file1=new FileReader("/home/abhilash/Documents/files/Sample");
			String s="";
			int ch;
			while((ch=file1.read())!=-1) {
				s=s+(char)ch;
			//	System.out.print(s);
			}
			System.out.println(s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
}
