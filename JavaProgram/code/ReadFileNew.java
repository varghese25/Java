import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileNew{
    public static void main(String[] args) {
        try {
        File myObj = new File("C:\\Users\\u\\Desktop\\JavaProgram\\TijuVarg.txt"); // File path obj created
        Scanner myReader = new Scanner(myObj); // Scanner used myReader obj call myObj from File
        while(myReader.hasNextLine()){ // while loop used to call Myreader which read the document .hasNextLine()
            String data = myReader.nextLine(); // String data used myReader which read nextlin() in txt document
            System.out.println(data); // Out put displayed

        }
    } catch (FileNotFoundException e) { // no data found throug error in the catch bock
        System.out.println("Error Occured");
        e.printStackTrace();

    }
}
}