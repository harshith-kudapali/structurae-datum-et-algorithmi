
import java.lang.*;
import java.util.*;
public class Main {
    public static void fact(int num){
        int fact=1;
        StringBuilder str= new StringBuilder();
        if (num>0){
        for (int i=1;i<=num;i++){
            String a=String.valueOf(i);
            if(i<num){
                a = a+"*";
            }
            str.append(a);
            fact *= i;
        }}
        else{
            fact=1;
        }
        System.out.print(num+"!="+str);
        System.out.println("="+fact);
    }
    public static void main(String[] args) {
        System.out.println("\n\n\nProgram:Write_a_program_to_print_the_factorial_of_a_number_by_defining_a_method_named_'Factorial");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num= input.nextInt();
        fact(num);
    }
}

    

