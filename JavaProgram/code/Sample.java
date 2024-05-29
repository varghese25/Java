import java.util.Scanner;
public class shann {
    public static void main (String[] args) {
        Scanner read = new Scanner(System.in);
         System.out.println("Enter the number: ");
        int num = read.nextInt();
       

    if(num % 2 == 0)
    System.out.println("number" + " Is Odd");
    else
    System.out.println("number" + " Is Even");
    }
}