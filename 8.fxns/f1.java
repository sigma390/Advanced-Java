public class f1 {
    public static void main(String[] args) {
        
        area(10,25);// call
        System.out.println(area1(25));
        System.out.println(stringPrinter(25,25,69));  


    }
    public static void area(int l , int b){
        System.out.println(l*b);


    }
    public static int area1(int a){
        return a*a;


    }
    public static int stringPrinter(int a , int b , int c){
        return a*b*c;


    }
}

