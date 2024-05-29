import java.io.FileWriter;
import java.io.IOException;
public class Firstwrite
{
public static void main(String[] args) {
    try {
        FileWriter myWrite = new FileWriter("TijuVarg.txt");
        myWrite.write("Im going to Enhance my Coding skill sooon i will become a developer");
        myWrite.close();
        System.out.println("Sucessfully Written");

    } catch (Exception e)
     {
        System.out.println("Error Occured");

        e.printStackTrace();
    }
}    
}