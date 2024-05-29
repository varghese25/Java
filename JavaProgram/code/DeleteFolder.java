import java.io.*;
public class DeleteFolder {
    public static void main(String[] args) {
        File myObj = new File("C:\\Users\\u\\Desktop\\JavaProgram\\New Folder");
        if (myObj.delete()) {
            System.out.println("Delete the Folder: " + myObj.getName());

        } else {
            System.out.println("Failed to Delete the Folder Removed");
        }
    }
}