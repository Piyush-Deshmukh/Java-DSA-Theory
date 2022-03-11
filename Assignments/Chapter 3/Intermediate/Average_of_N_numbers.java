import java.util.Scanner;

public class Average_of_N_numbers {
    public static void main(String[] args) {
        int sum = 0;
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the number of terms ");
        int n = a.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter the " + i + " number ");
            int num = a.nextInt();
            sum += num;
        }
        System.out.println("Average = " + (sum/n));
    }
}
