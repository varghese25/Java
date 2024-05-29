import java.util.*;
public class EvenOrOdd{

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the Number: ");
    int number = reader.nextInt();

        if (number % 2 == 0)
            System.out.println(number + " is Even ");
            else 
            System.out.println(number + "is Odd");
        }
    }