import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num=1;
        int sum=0;
        System.out.println("Enter the numbers");
        while(num != 0){
            num= input.nextInt();
            sum+= num;
        }
        System.out.println("The sum is "+sum);
    }
    
}
