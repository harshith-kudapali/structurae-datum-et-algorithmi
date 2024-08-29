import java.util.Scanner;
public class Main {
    public static void oddOrEven(int num){
        String A;
        if (num%2==0){
            A="Even";
        }
        else{
            A="Odd";
        }
        System.out.println(A);
    }
    public static void main (String[] args){
        System.out.println("\n\n\nDefine_a_program_to_find_out_whether_a_given_number_is_even_or_odd.");
        Scanner input = new Scanner(System.in);
        int num=input.nextInt();
        oddOrEven(num);
    }
    
}
