import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        System.out.print("Enter your Name ");
        Scanner a = new Scanner(System.in);
        System.out.println("Hello, " + a.next()); // Takes string without spaces
        System.out.println("Hello, " + a.nextLine()); // Takes string with spaces
    }
}
