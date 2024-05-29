import java.io.File;
import java.io.IOException;
public class FileDoc
{
    public static void main(String[] args) {
        try {
        File myFileDoc = new File("Shannon.pdf");
        if(myFileDoc.createNewFile())
        {
            System.out.println("FileCreated: "+ myFileDoc.getName());
        } else {
            System.out.println("File name Already in the System");
        }
            
        } catch (Exception e) {
           System.out.println("Error Occured");
           e.printStackTrace();
        }
    }

} 