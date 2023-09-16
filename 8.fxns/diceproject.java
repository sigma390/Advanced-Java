import java.util.Scanner;

public class diceproject {
    public static void main(String[] args) {
        int x[] = new int[3];
        int dSum = 0;
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter 3 Nums between 1 and 6");
        int y[] = new int[3];
        for (int index = 0; index < y.length; index++) {
            y[index] = scan.nextInt();
            if (y[index]<1 || y[index]>6) {
                System.out.println("Shutting Down System");
                break;
            }
            sum =sum+y[index];
        }





        scan.nextLine();
        for (int index = 0; index < y.length; index++) {
            if (y[index]<1 || y[index]>6) {
                System.out.println("Shutting Down !!!");
                break;

            }
            else
            {
                System.out.println("Click Yes to Roll Dice ");
                break;
            }
        }
        
        
        String ch = scan.nextLine();
        switch(ch){
        case "yes" : for (int index = 0; index < 3; index++) {
                    x[index] = rolldice();
                    dSum +=x[index];
                    }
                    for (int index = 0; index < x.length; index++) {
                        System.out.println("rolled output is :"+x[index]);
                    }

                 break;
        case "no" :
        case "NO" :
                 System.out.println("Thanks for visiting the shop");

                }
    
    win(sum , dSum);
    scan.close(); 
    }
    public static int rolldice() {

        double randomNum = Math.random()*6;
        randomNum+=1;
        return (int)randomNum; //type cast
        
    }

    public static void  win(int sum, int dSum) {
        if (sum >= dSum && (sum - dSum < 3)) {
            System.out.println("Congratulations You Have WON!!!!!");
            
        }
        else
        {System.out.println("Better Luck Next Time");}
    }
   
}
