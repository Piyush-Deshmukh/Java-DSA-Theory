import java.util.Scanner;

public class Print_Largest_num {
    public static void main(String[] args) {
        int n = 1, i = 0;
        Scanner a = new Scanner(System.in);
        while(n  > 0){
            System.out.print("Enter a number ");
            n = a.nextInt();
            if(n == 0){
                break;
            }    
            else{
                if(n > i){
                    i = n;
                }
            }
        }
        System.out.print(i);
    }
}