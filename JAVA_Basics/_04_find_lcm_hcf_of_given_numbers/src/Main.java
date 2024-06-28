import java.util.Scanner;
public class Main {
    public static int HCF(int a , int b){
        if (a<b){
            int temp =a;
            a=b;
            b=temp;
        }
        while (b>0){
            int temp =b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static int LCM (int a, int b){
        return (a*b)/HCF(a,b);
    }
    public static void main (String args[]){
        Scanner input =new Scanner(System.in);
        System.out.print("Enter 1ST number:");
        int a= input.nextInt();
        System.out.print("Enter 2ND number:");
        int b= input.nextInt();
        System.out.println ("HCF="+HCF(a,b)+"\nLCM="+LCM(a,b));
    }
}
