package learn.lessun01;
import java.util.Scanner;

public class Main {
     
    public static void main(String[] args) {
        
        Sav1 S1 = new Sav1();

        Scanner scn = new Scanner(System.in);

        System.out.println("好きな文字を入力してください>>");
        String userInput = scn.nextLine(); 
        scn.close();
        
        S1.SetSav1(userInput);
        S1.echo();
        
    }

}

