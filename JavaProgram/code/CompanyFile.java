import java.io.File;
import java.io.IOException;
public class CompanyFile {
    public static void main(String[] args) {
        try {
            File MyDepFile = new File("Evan.txt");
            if(MyDepFile.createNewFile())
             { 
            System.out.println("File Created:" + MyDepFile.getName());
        } 
        else {
                System.out.println("Alreay Exist");
            
            }
        } catch (Exception e) 

        {
        System.out.println("Error Occured File"); 
        e.printStackTrace();
        }
    }
}