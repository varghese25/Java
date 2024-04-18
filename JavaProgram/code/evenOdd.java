import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try{
            File myObj = new File("Varghese.txt");
            if(myObj.createNewFile())
            {
                System.out.println("File Created:" + myObj.getName());
            }
            else{
                System.out.println("File Already Exist");
            }
        }
        catch(IOException e)
        {
System.out.println("An Error Occurd");
e.printStackTrace();
        }
        }
    }