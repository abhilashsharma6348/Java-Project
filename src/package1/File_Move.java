package package1;
import java.io.*; 
import java.nio.file.Files; 
import java.nio.file.*; 

public class File_Move {
	public static void main(String[] args) throws IOException 
    { 
        Path temp = Files.move(Paths.get("/home/abhilash/Documents/data.json"),Paths.get("/home/abhilash/Documents/Scala_Project/data1.json")); 
  
        if(temp != null) 
        { 
            System.out.println("File renamed and moved successfully"); 
        } 
        else
        { 
            System.out.println("Failed to move the file"); 
        } 
    } 
}
