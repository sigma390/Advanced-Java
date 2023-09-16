public class getset {

    String name;
    int year;
    double price;

    public getset(String name,int year,double price){
        this.name = name;
        this.year = year;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public int getYear(){
        return this.year;
    }
    public void setPrice(double price){
        this.price = price;
    }



    public static void main(String[] args) {
        getset gs1 = new getset("ktm",2022,312000);

        System.out.println(gs1.getName());
        System.out.println(gs1.getYear());
        double x = 322222.0;
        double s = gs1.setPrice(x);
        System.out.println(s);


    }
    
}
