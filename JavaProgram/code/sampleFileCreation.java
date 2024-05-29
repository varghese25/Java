import java.io.File;
import java.io.IOException;
public class sampleFileCreation {
    public static void main(String[] args) {
        try { 
        File myNewfile = new File("Serah.doc");
        if(myNewfile.createNewFile()) {
            System.out.println("New File Created:" + myNewfile.getName());
        } else {
            System.out.println("File Alread Exist");
        }
     } catch (IOException e){
            System.out.println("Error Occured");
            e.printStackTrace();
        }
    }
}
    