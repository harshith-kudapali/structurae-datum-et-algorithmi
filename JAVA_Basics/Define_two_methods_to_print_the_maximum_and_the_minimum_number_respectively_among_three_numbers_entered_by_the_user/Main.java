
import java.util.Scanner;

public class Main {
    public static void displayy_max(int a, int b ,int c){
        int num=0;
        if (a>b && a>c){
            num=a;
        }
        if (b>a && b>c){
            num=b;
        }
        else{
            num=c;
        }
        System.out.println("Largest:"+num);
    }
    public static void displayy_min(int a, int b ,int c){
        
        int num=0;
        if (a<b && a<c){
            num=a;
        }
        if (b<a && b<c){
            num=b;
        }
        else{
            num=c;
        }
        System.out.println("Smallest:"+num);
        
    }
    public static void main(String[] args){
        System.out.println("\n\n\nDefine_two_methods_to_print_the_maximum_and_the_minimum_number_respectively_among_three_numbers_entered_by_the_user");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbber");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        displayy_max(x, y, z);
        displayy_min(x, y, z);

    }  
}
