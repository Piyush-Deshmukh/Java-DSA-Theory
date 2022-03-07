import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        int rem, result = 0;
        System.out.print("Enter a number ");
        Scanner a = new Scanner(System.in);
        int originalnum = a.nextInt();
        int num = originalnum;

        while (num != 0) {
            rem = num % 10;
            result = result + rem*rem*rem;
            num /= 10;
        }

        if (result == originalnum){
            System.out.println(originalnum + " is an Armstrong number.");
        }
        else {
            System.out.println(originalnum + " is not an Armstrong number.");
        }
    }
}
