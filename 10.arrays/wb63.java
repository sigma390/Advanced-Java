import java.util.Scanner;

public class wb63 {
    public static void main(String[] args) {

        String [] items = {"kanda", "batata", "limbu", "lasun"};
        System.out.println("Do you wanna sell loda");
        for (int index = 0; index < items.length; index++) {
            if (items[index].equals("loda")) {
                System.out.println("found item");
            }
            
        }
        System.out.println("not there");
    }
}
