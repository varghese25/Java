import java.io.File;
public class GetFileInfo { // Class name
    public static void main(String[] args) {
        File myObj = new File("Tinu.txt"); // object creted myObj and file nname or you mention path name 
        if (myObj.exists())  // if else condtion used
        {
            System.out.println("File name:" + myObj.getName()); //getName method 
            System.out.println("Path:" + myObj.getAbsolutePath()); // getAbsolutepath method 
            System.out.println("Read: " + myObj.canRead()); // canRead method
            System.out.println("Write:" + myObj.canWrite()); // canWrite method
            System.out.println("Length: " + myObj.length()); // length method

            
        } else {
            System.out.println("File Doest Not exist"); //  else conditon file does'nt exists
            
        }
    }
    
}