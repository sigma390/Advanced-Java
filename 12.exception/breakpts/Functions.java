public class Functions {
    public static void main(String[] args) {

        int gryffindor = 500;    
        int ravenclaw = 100;
        int pointsMargin = ravenclaw - gryffindor;// here mistake
        int ranking = ranking(pointsMargin);
        System.out.println(ranking);

    }

    public static int ranking(int pointsMargin) { //here taking -400pts so givin answer 4
        if (pointsMargin < -100) {
            return 4;
        } else if (pointsMargin >= -100) {
            return 3;
        } else if (pointsMargin >= 0) {
            return 2;
        } else {
            return 1;
        } 
    }


}
