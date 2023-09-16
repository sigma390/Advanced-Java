public class fxnsolves {
        public static void main(String[] args) {
    
            int gryffindor = 500;    
            int ravenclaw = 100;
            int pointsMargin = gryffindor - ravenclaw;// here mistake
            int ranking = ranking(pointsMargin);
            System.out.println(ranking);

            Math.max(3,6);
    
        }
    
        public static int ranking(int pointsMargin) { //here taking -400pts so givin answer 4
            if (pointsMargin < 300) {
                return 1;
            } else if (pointsMargin >= 0) {
                return 2;
            } else if (pointsMargin >= -100) {
                return 3;
            } else {
                return 4;
            } 
        }
    
    
    }
    
