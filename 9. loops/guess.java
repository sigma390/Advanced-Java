import java.util.Scanner;

public class guess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter num");
        int num = input.nextInt();
        while(num > 5 || num <1){
            System.out.println("try again");
            num = input.nextInt();
            if (num<=5 || num>=1) {
                System.out.println("u got it!!!");
            }

        }
    }
}
