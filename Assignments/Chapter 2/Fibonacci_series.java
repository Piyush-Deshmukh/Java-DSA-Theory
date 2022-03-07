import java.util.Scanner;

public class Fibonacci_series {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3 = 0, count = 0;
        System.out.print("Enter number ");
        Scanner a = new Scanner(System.in);
        count = a.nextInt();
        while (n1 <= count){
            System.out.print(n1 + " ");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}
