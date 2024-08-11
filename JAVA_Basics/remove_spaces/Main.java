import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        System.out.println("Program:Replacing the spaces");
        System.out.println("Enter the string");
        Scanner input= new Scanner(System.in);
        String str= input.nextLine();
        int strLn= str.length();
        StringBuilder modstr = new StringBuilder();
        for (int i=0;i<strLn;i++){
            char letter=str.charAt(i);
            if (letter==' '){
                modstr.append('_');
            }
            else{
                modstr.append(letter);
            }
        }
        System.out.println(modstr.toString());

    }

    
}
