import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        float num1, num2;
        char op;
        System.out.print("Enter in num1 operator num2 format ");
        Scanner a = new Scanner(System.in);
        num1 = a.nextFloat();
        op = a.next().charAt(0);
        num2 = a.nextFloat();
        if (op == '+'){
            System.out.print((num1 + num2));
        }
        else if (op == '-'){
            System.out.print((num1 - num2));
        }
        else if (op == '*'){
            System.out.print((num1 * num2));
        }
        else if (op == '/'){
            System.out.print((num1 / num2));
        }
        else if (op == '%'){
            System.out.print((num1 % num2));
        }
        else{
            System.out.print("Error!");
        }
    }
}
