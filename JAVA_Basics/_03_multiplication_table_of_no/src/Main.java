import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("ENTER A NUMBER:");
        Scanner input= new Scanner(System.in);
        int num =input.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+"X"+i+"="+(num*i));

        }
        System.out.println("ThankYou");
    }
}