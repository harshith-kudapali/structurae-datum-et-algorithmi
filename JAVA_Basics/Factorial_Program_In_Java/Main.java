import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Factorial_Program_In_Java");
        System.out.println("Enter the number :");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int fact=1;
        for (int i = 1; i<=num;i++){
            fact*=i;

        }
        System.out.println(fact);
        
        
    }
}
