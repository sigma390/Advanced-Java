import java.util.*;;

public class delimiters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter two  interegers");
        int a = scan.nextInt();
        int b = scan.nextInt();



        System.out.println("entern two integers on same line");
        int c = scan.nextInt();
        int d = scan.nextInt();



        System.out.println("enter two Decimals on same line");
        double d1  = scan.nextDouble();
        double d2  = scan.nextDouble();

        System.out.println("enter two texts on same line");
        String s1  = scan.nextLine();
        String s2  = scan.nextLine();
         scan.close();

         System.out.println("here all _________________*****");

         System.out.println("integers : "+a+" , "+b);
         System.out.println("very big integers : "+c+" , "+d);
         System.out.println("doubless : "+d1+" , "+d2);
         System.out.println("integers : "+s1+" , "+s2);

    }
}
