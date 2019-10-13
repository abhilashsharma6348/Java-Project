package package1;
import java.io.*;

public class CSV_Reader {
  public static void main(String[]args) {
	  try {
	  BufferedReader br = new BufferedReader(new FileReader("/home/abhilash/Documents/files/CSV_files/day.csv"));
	  String line = "";
	  while((line = br.readLine())!=null) {
		  System.out.println(line);
	  }
	  }catch(FileNotFoundException ex) {
		  System.out.println("FileNotFoundException has occured");
	  }catch(IOException ex1) {
		  System.out.println("IOException has occured");
	  }
  }
}
