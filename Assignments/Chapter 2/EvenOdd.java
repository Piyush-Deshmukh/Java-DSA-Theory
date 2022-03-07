import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.print("Enter a number ");
        Scanner a = new Scanner(System.in);
        int s = a.nextInt();
        if (s%2 == 0){
            System.out.println(s + " is a Even number.");
        }
        else{
            System.out.println(s + " is a Odd number.");
        }    
    }
}
