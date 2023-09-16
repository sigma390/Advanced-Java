import java.lang.reflect.Array;
import java.util.Arrays;

class car1 {


    private String name;
    private int year;
    private double price;
     private String[] parts;
    // original constructor
    public car1(String name,int year,double price, String [] parts){
        this.name = name;
        this.year = year;
        this.price = price;
        this.parts = Arrays.copyOf(parts, parts.length);
    }
    public String [] getParts(){
        return Arrays.copyOf(this.parts, this.parts.length);// for safeguard
    }
    public void show(){
        System.out.println("name is :"+name);
        System.out.println("price is :"+price);
    }




    public static void main(String[] args) {
        String[] parts = {"tyre", "rim"};
        car1 c1 = new car1("GTR", 2018, 30000,parts);
        car1 c3 = new car1("kawasaki", 2022, 200000,parts); //calling copy constructor
        c3.show();
        System.out.println(Arrays.toString(c1.parts));
        parts[0] = "omkar";
        System.out.println(Arrays.toString(c1.parts));

    
}
}


