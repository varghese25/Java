import java.io.File;
public class DeleteFiles {
public static void main(String[] args) {
   File myObj =  new File("Shannon.pdf");
   if (myObj.delete()) {
    System.out.println("Deleted From System:" + myObj.getName());
    
   } else {
    System.out.println("Failed");
   } 
}    
}