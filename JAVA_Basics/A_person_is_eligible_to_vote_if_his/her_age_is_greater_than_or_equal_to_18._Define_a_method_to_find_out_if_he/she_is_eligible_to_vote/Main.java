import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.println("\n\n\nPrange:A_person_is_eligible_to_vote_if_his/her_age_is_greater_than_or_equal_to_18._Define_a_method_to_find_out_if_he/she_is_eligible_to_vote");
        System.out.println("Enter the DOY");
        int DOB= input.nextInt();
        checkeligblity(DOB);

    }
    public static void checkeligblity(int num){
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int age= year-num;
        if (age<18){
            System.out.println("person_is_NOT_eligible");
        }
        else{
            System.out.println("person_is_eligible");
        }


    }
    
}
