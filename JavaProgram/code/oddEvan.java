import java.util.Scanner;
public class oddEven {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = reader.nextInt();
        
if(number % 2 == 0)
    System.out.println(number + "Number is Even");
    else
    System.out.println(number + "Number is Odd");

    }
}