import java.util.Scanner;

public class Subtract_Product {
    public static void main(String[] args) {
        int num, prod = 1, sum = 0;
        Scanner a = new Scanner(System.in);
        num = a.nextInt();
        while(num > 0){
            int b = num%10;
            prod *= b;
            sum += b;
            num /= 10;
        }
        int diff = prod - sum;
        System.out.print(diff);
    }
}