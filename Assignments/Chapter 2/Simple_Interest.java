import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        float p, r, t;
        Scanner a = new Scanner(System.in);
        System.out.print("Enter Principal ");
        p = a.nextFloat(); 
        System.out.print("Enter Time ");
        r = a.nextFloat();
        System.out.print("Enter Rate ");
        t = a.nextFloat();
        System.out.println("Simple Interest = " + (p*r*t)/100);
    }
}
