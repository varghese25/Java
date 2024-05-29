import java.util.Scanner;
public class evenNumber {
    public static void main(String[] args) {
 Scanner reader = new Scanner(System.In);
 System.out.println("Enter the Number");
 int Number = reader.nextInt();
 if(Number % 2==0)
 System.out.println(Number + " Is Even");
 else
 System.out.println(Number + " Is Odd");

    }
}