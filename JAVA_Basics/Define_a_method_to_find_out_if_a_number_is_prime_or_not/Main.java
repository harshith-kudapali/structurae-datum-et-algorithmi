
import java.util.Scanner;

public class Main {
    public static void check_prime(int num){
        int flag=0;
        for (int i=2;i<num;i++){
            if (num%i==0){
                flag=1;
            }
        }
        if (flag!=0){
            System.out.println("NotPrime");
        }
        else{
            System.out.println("Prime");
        }
    }
    public static void main (String[] args){
        System.out.println("\n\n\nProgram:Define_a_method_to_find_out_if_a_number_is_prime_or_not");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = input.nextInt();
        check_prime(num);
    }
    
}
