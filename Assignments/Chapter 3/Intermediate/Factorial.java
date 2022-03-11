import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int f = 1;
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = a.nextInt();
        for (int i = num; i >= 1; i--) {
            f *= i;
        }
        System.out.println(f);
    }
}
