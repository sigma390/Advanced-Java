import java.util.Arrays;

public class car {


        private String name;
        private int year;
        private double price;
        private String[] parts;
        // original constructor
        public car(String name,int year,double price, String [] parts){
            this.name = name;
            this.year = year;
            this.price = price;
            this.parts = Arrays.copyOf(parts, parts.length);
        }
        // copy constructor
        public car(car x){
            this.name = x.name;
            this.year = x.year;
            this.price = x.price;

        
}
        public void show(){
            System.out.println("name is :"+name);
            System.out.println("price is :"+price);
        }

        public static void main(String[] args) {
            String[] parts = {"tyre", "rim"};
            car c1 = new car("GTR", 2018, 30000,parts);
            car c3 = new car("kawasaki", 2022, 200000,parts);
            car c2 = new car(c1); // calling copy constructor
            c2.show();
            c3.show();
            System.out.println(Arrays.toString(c1.parts));
            
    }
}
