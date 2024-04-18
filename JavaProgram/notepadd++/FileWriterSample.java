import java.io.FileWriter;
import java.io.IOException;
public class FileWriterSample{
public static void main(String[] args) {
	try {
		FileWriter myWrite = new FileWriter("Varghese.txt");
		myWrite.write("Hi im new fresh developer");
		myWrite.close();
		System.out.println("Sucessfully Writern");
		
		}
		catch(IOException e)
		{
			System.out.println("Error Occured");
			e.printStackTrace();
			
		}
}
}
	