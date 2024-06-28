import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0;
        String a= new String("null");
        System.out.print("Enter:");
        a=in.next();
        while(true){
            if (a.equals("x"))
            {
                break;
            }
            sum = Integer.parseInt(a)+sum;
            System.out.print("Enter:");
             a=in.next();
        }
        System.out.println(sum);
    }
}
