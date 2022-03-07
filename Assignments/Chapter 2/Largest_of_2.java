import java.util.Scanner;

public class Largest_of_2 {
    public static void main(String[] args) {
        float num1, num2;
        System.out.print("Enter two number ");
        Scanner a = new Scanner(System.in);
        num1 = a.nextFloat(); 
        num2 = a.nextFloat();
        if (num1 > num2){
            System.out.println(num1 + " is greater than " + num2);
        } 
        else if (num1 < num2){
            System.out.println(num2 + " is greater than " + num1);
        } 
        else {
            System.out.println("Both numbers are equal");
        } 
    }
}
