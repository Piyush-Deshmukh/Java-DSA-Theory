import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        int r, b, h;
        System.out.println("Choices : ");
        System.out.println("1 --> Perimeter of Circle");
        System.out.println("2 --> Perimeter of Equilateral triangle");
        System.out.println("3 --> Perimeter of Parallelogram");
        System.out.println("4 --> Perimeter of Rectangle");
        System.out.println("5 --> Perimeter of Square");
        System.out.println("6 --> Perimeter of Rhombus");
        System.out.print("Enter your choice ");
        Scanner a = new Scanner(System.in);
        int choice = a.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius ");
                r = a.nextInt();
                System.out.println("Perimeter of Circle is " + 2 * 3.14 * r);
                break;

            case 2:
                System.out.print("Enter Side ");
                b = a.nextInt();
                System.out.println("Perimeter of Equilateral triangle is " + 3 * b);
                break;

            case 3:
                System.out.print("Enter Base and Height ");
                b = a.nextInt();
                h = a.nextInt();
                System.out.println("Perimeter of Parallelogram is " + 2*(b + h));
                break;

            case 4:
                System.out.print("Enter Length and Breadth ");
                b = a.nextInt();
                h = a.nextInt();
                System.out.println("Perimeter of Rectangle is " + 2*(b + h));
                break;
            case 5:
                System.out.print("Enter Side ");
                b = a.nextInt();
                System.out.println("Perimeter of Square is " + 4 * b);
                break;

            case 6:
                System.out.print("Enter Side");
                b = a.nextInt();
                System.out.println("Perimeter of Rhombus is " + 4 * b);
                break;

            default:
                System.out.println("Error!");
                break;
        }
    }
}
