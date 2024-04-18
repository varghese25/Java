import java.io.File;
import java.io.IOException;
public class FileCreation {
    public static void main(String[] args)
    {
        try{
            File myObj = new File("Tiju Varghese.ppt"); // Object creaeted  file name and extension
            if(myObj.createNewFile()) { // create New file function used for myobj in if statement
                System.out.println("File Created:" +myObj.getName()); // S.O.P concetae with myOb.getName method
             } else {
                    System.out.println("File Already Exist"); //else S.O.P say file already exist
                }

            } catch (Exception e)
            {
System.out.println("An Errocured"); //Catch it says error occured
e.printStackTrace();
            }
        }
    }
