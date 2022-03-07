public class if_and_Loops {
    public static void main(String[] args) {
        int a = 10;
        if (a == 10) {
            System.out.println("Hello World");
        }
        
        System.out.println("******************");
        
        int count = 1;
        while (count != 5) {
            System.out.println(count);
            count++;
        }
        System.out.println(count);
        
        System.out.println("******************");

        for (int i = 1; i != 5; i++) {
            System.out.println(i);
        }
    }
}