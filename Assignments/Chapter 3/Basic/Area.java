import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        int r, b, h;
        System.out.println("Choices : ");
        System.out.println("1 --> Area of Circle");
        System.out.println("2 --> Area of Triangle");
        System.out.println("3 --> Area of Rectangle");
        System.out.println("4 --> Area of Isoceles triangle");
        System.out.println("5 --> Area of Parallelogram");
        System.out.println("6 --> Area of Rhombus");
        System.out.println("7 --> Area of Equilateral triangle");
        System.out.print("Enter your choice ");
        Scanner a = new Scanner(System.in);
        int choice = a.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius ");
                r = a.nextInt();
                System.out.println("Area of Circle is " + 3.14 * r * r);
                break;

            case 2:
                System.out.print("Enter Base and Height ");
                b = a.nextInt();
                h = a.nextInt();
                System.out.println("Area of Triangle is " + 0.5 * b * h);
                break;

            case 3:
                System.out.print("Enter Length and Breadth ");
                b = a.nextInt();
                h = a.nextInt();
                System.out.println("Area of Rectangle is " + b * h);
                break;

            case 4:
                System.out.print("Enter Base and Height ");
                b = a.nextInt();
                h = a.nextInt();
                System.out.println("Area of Isoceles triangle is " + 0.5 * b * h);
                break;

            case 5:
                System.out.print("Enter Base and Height ");
                b = a.nextInt();
                h = a.nextInt();
                System.out.println("Area of Parallelogram is " + b * h);
                break;

            case 6:
                System.out.print("Enter Diagonal1 and Diagonal2 ");
                b = a.nextInt();
                h = a.nextInt();
                System.out.println("Area of Rhombus is " + 0.5 * b * h);
                break;

            case 7:
                System.out.print("Enter Side ");
                b = a.nextInt();
                System.out.println("Area of Equilateral triangle is " + 0.433 * b * b);
                break;

            default:
                System.out.println("Error!");
                break;
        }
    }
}
