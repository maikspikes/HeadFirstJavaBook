package experiments;

public class Experiment1 {
        public static void main(String[] args) {
            int bottlesNum = 2;
            String word = "bottles";
            while (bottlesNum > 0) {
                if (bottlesNum > 1) {
                    word = "bottles"; // plural, more than one bottle.
                } else {
                    word = "bottle"; // singular, one bottle.
                }
                System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
                System.out.println(bottlesNum + " green " + word + ", hanging on the wall");
                System.out.println("And if one green " + word + " should accidentally fall,");
                bottlesNum = bottlesNum - 1;
                if (bottlesNum == 1) {
                    word = "bottle"; // singular, one bottle.
                }
                if (bottlesNum > 0) {
                    System.out.println("There'll be " + bottlesNum +
                            " green " + word + ", hanging on the wall");
                } else {
                    System.out.println("There'll be no green bottles, hanging on the wall");
                } // end else
            } // end while loop
        } // end main method
    } // end class

