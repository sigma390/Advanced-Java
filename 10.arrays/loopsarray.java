public class loopsarray {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9,0};
        for (int index = 0; index < arr.length; index++) {
            System.out.println(index);
        }
        System.out.println("\n");


        for (int x : arr) {
            System.out.println(x);
        }



    }
}
