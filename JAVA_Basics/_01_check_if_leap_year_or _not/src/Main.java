//Author <HarshithSk>//
/*
How to determine whether a year is a leap year
To determine whether a year is a leap year, follow these steps:

1 If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
2 If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
3 If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
4The year is a leap year (it has 366 days).
5 The year is not a leap year (it has 365 days).
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the year you want to check:");
        Scanner input = new Scanner(System.in);
        int year=input.nextInt();
        if (year%4==0){
            if (year%100==0){
                if(year%400==0)
                 {
                    System.out.println("the give year is a LEAP year");
                 }
                else{
                    System.out.println("the give year is a NOT LEAP year");

                }
             }
            else {
                System.out.println("the give year is a LEAP year");
            }

        }
        else
        {
            System.out.println("the give year is a NOT LEAP year");
        }
        System.out.println("ThankYou");

    }
}