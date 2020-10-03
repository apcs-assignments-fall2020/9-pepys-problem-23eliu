public class MyMain {

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        int count = 0;
        int time = 10000;
        for (int i = 1; i <= time; i++) {
            for (int j = 1; j <= 6; j++) {
                if ((int) ((Math.random() * 6) + 1) == 6) {
                    count++;
                    break;
                }
            }
        }
        double fin = count/100;
        return fin;
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int count = 0;
        int time = 10000;
        int scount = 0;
        for (int i = 1; i <= time; i++) {
            for (int j = 1; j <= 12; j++) {
                if ((int) ((Math.random() * 6) + 1) == 6) {
                    scount++;
                }
            }
            if (scount > 1) {
                count++;
            }
            scount = 0;
        }
        double fin = count/100;
        return fin;
    }

    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        int count = 0;
        int time = 10000;
        int scount = 0;
        for (int i = 1; i <= time; i++) {
            for (int j = 1; j <= 18; j++) {
                if ((int) ((Math.random() * 6) + 1) == 6) {
                    scount++;
                }
            }
            if (scount > 2) {
                count++;
            }
            scount = 0;
        }
        double fin = count/100;
        return fin;
    }


    public static void main(String[] args) {
        System.out.println(probabilityOneSix());
        System.out.println(probabilityTwoSixes());
        System.out.println(probabilityThreeSixes());
    }
}
