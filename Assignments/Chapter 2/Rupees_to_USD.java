import java.util.Scanner;

public class Rupees_to_USD {
    public static void main(String[] args) {
        float r;
        System.out.print("Enter the amount in Rupees ");
        Scanner a = new Scanner(System.in);
        r = a.nextFloat();
        System.out.println(r + " Rupees in USD is " + r*0.013);
    }
}