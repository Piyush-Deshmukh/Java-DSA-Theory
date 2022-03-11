import java.util.Scanner;

public class Factors_of_number {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter a number ");
        int n = a.nextInt();
        for(int i = 1; i <= n; i++){
            if(n%i == 0){
                System.out.print(i + " ");
            }
        }

    }
}
