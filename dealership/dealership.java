import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;


public class dealership {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcom to Om MOTOR Dealership :");
        System.out.println(" 1.Select option 'A' to buy a car");
        System.out.println(" 2.Select Option 'B' To sell Car");
        String Ch = scan.nextLine();
        switch(Ch){

            case "a" :
            case "A" :
                        System.out.println("What is Your Budget in Lakhs ?");
                        int budget = scan.nextInt();
                        if (budget>= 15) {
                            System.out.println("Yes Creta Is Available");
                            System.out.println("Do You Have Insurance(Y/N) ?");
                            scan.nextLine();// nextline trap
                            String insurance = scan.nextLine();
                            System.out.println("Do You Have License(Y/N) ?");
                            String License = scan.nextLine();
                            System.out.println("What is CREDIT Score ?");
                            int cs = scan.nextInt();
                            if (insurance.equals("Yes")&&cs>=660) {
                                System.out.println("Car Sold , Welcome to Hyundai Car Family");
                                
                            }
                            
                        }
                        else {
                            System.out.println("Low Budget Sorry!!!");
                        }

                        break;
            case "b" :
            case "B" : 
                        System.out.println("You Chose Option "+ Ch);
                        break;
            default :
                    System.out.println("Invalid Option!!!!!");
                    break;



        }
        scan.close();
    }
    
    
}
