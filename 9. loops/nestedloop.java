public class nestedloop {
    public static void main(String[] args) {
        for (int index = 0; index < 3; index++) {
            System.out.println("run :"+index);
            for (int j = 0; j < 3; j++) {
                System.out.println(j);
            }
        }
    }
}
