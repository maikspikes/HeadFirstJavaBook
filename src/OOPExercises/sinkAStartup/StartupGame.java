//package OOPExercises.sinkAStartup;
//
//public class StartupGame {
//
//    public static void main(String[] args) {
//        int numOfGuesses = 0;
//        GameHelper helper = new GameHelper();
//        Startup startup1 = new Startup();
//
//
//
//
//        int randomNum = (int) (Math.random() * 5);
//
//        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
//
//        startup1.setLocationCells(locations);
//
//        boolean isAlive = true;
//
//
//        while (isAlive) {
//            int guess = helper.getUserInput("3");
//            String result = startup1.checkYourself(guess);
//            numOfGuesses++;
//            if (result.equals("kill")){
//                isAlive = false;
//                System.out.println("You took " + numOfGuesses + " guesses");
//            }
//        }
//
//    }
//}
