import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter FIRST NUMBER:");
        int F_no=input.nextInt();
        System.out.print("Enter SECOND NUMBER:");
        int S_no=input.nextInt();
        System.out.println("The sum is: "+(F_no+S_no));

    }
}