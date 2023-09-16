import java.net.URI;
import java.net.URLClassLoader;
import java.util.Scanner;

import javax.xml.crypto.dsig.CanonicalizationMethod;

public class RpSGame {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");
        String ready = inp.next();



        if ((ready.equals("Yes"))||(ready.equals("yes"))) {
            System.out.println("Great Welcome to Rock Paper Scissors");
            System.out.println("\n1.Rock\n2.Paper\n3.Scissors");
            System.out.println("Choose one!!!");
            String URchoice = inp.next();
          
            

            String ComChoice = Comchoice();
            
            String Result = Results(URchoice,ComChoice);
            
            
            if (Result.equals("U Win!!!")) {
                System.out.println(">>>U WON , GREAT!!<<<");
            }
            else if (Result.equals("U LOST!!!")) {
                System.out.println(">>>BETTER LUCK NEXT TIME<<<");
            }
            else if (Result.equals("its a tie")) {
                System.out.println(">>>ITS A TIE<<<");

            }
            else{}

            
        }
        else{
            System.out.println("INVALID CHOICEE!!!!");
        }
        inp.close();
    }

    //functions

    //computer choice
    public static String Comchoice(){
        double r = Math.random()*3;
        int y = (int)r;
        switch(y){
                case 0:return "rock";
                case 1:return "paper";
                case 2:return "scissors";
                default: return "";
                }
    }

    public static String Results(String URchoice, String ComChoice){
        String Res = "";
        if (URchoice.equals("rock") && ComChoice.equals("scissors")) {
            Res = "U Win!!!";
        }
        else if(URchoice.equals("paper") && ComChoice.equals("scissors")){
            Res = "U LOST!!!";
        }
        else if (URchoice.equals("scissors") && ComChoice.equals("paper")) {
            Res = "U Win!!!";
        }
        else if (URchoice.equals("paper") && ComChoice.equals("rock")) {
            Res = "U Win!!!";
        }
        else if (URchoice.equals("rock") && ComChoice.equals("paper")) {
            Res = "U LOST!!!";
        }
        else if (URchoice.equals("scissors") && ComChoice.equals("rock")) {
            Res = "U LOST!!!";
        }
        else if (URchoice.equals(ComChoice)) {
            Res = "its a tie";
        }
        else{
            System.out.println("INVALID CHOICE!!!");
        }
        return Res;
    }

    
}
