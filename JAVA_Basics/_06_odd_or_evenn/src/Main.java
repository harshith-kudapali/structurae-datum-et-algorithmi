import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a Number");
        int a= in.nextInt();
        if ((a%2)==0){
            System.out.println("The given number is EVEN");
        }
        else System.out.println("The given number is ODD");
    }//end of main function
}//end of main class
