package package1;

import java.io.BufferedReader;
import java.io.FileReader;

public class MyBufferedReader {
 public static void main(String[]args) {
	 try {
			FileReader file1=new FileReader("/home/abhilash/Documents/files/Sample");
			BufferedReader br = new BufferedReader(file1);
			String str="";
			int i=1;
			while((str=br.readLine())!=null) {
				System.out.println(str.toString());
			//	System.out.println(i++);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 }
}
