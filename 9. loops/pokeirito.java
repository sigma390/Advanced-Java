public class pokeirito {


    public static String randomCard(){
        double rn = Math.random()*13;
        rn+=14;
        int rnInt = (int)rn;
        switch (rnInt) {
            case 1:
                System.out.println("holla is 1");
            break;
            case 2:
            System.out.println("holla is 2");

                
            break;
            case 3:
            System.out.println("holla is 3");
                
            break;
            case 4:
            System.out.println("holla is 4");
                
            break;
            case 5:
            System.out.println("holla is 5");
            break;
            case 6:
            System.out.println("holla is 6");
            break;
            case 7:
            System.out.println("holla is 7");
            break;
            case 8:
            System.out.println("holla is 8");
            break;
            case 9:
            System.out.println("holla is 9");
            break;
            case 10:
            System.out.println("holla is 10");
            break;
            case 11:
            System.out.println("holla is 11");
            break;
            case 12:
            System.out.println("holla is 12");
            break;
            case 13:
            System.out.println("holla is 13");
            break;
            
        
            default:
                break;
        }
    return "thanks";
    }
    public static void main(String[] args) {
        randomCard();
    }
}
