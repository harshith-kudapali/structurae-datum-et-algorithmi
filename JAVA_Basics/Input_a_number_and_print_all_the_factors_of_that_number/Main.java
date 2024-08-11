import java.util.Scanner;
class Main{
    public static void main(String[] args){
        System.out.println("Program:Input a number and print all the factors of that number ");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        for (int i=1 ;i<num;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }


        

        
    }
}