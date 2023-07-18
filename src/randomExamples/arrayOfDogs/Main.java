package randomExamples.arrayOfDogs;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dog[] pets;

        pets = new Dog[3];

        pets[0] = new Dog();
        System.out.println(Arrays.toString(pets));
        pets[1] = pets[0];

        System.out.println(Arrays.toString(pets));

        pets[2] = new Dog();
        System.out.println(Arrays.toString(pets));

    }
}





//    int[] dogs = new int[3];
////        dogs = new int[3];
//
//        dogs[0] = 3;
//                dogs[1] = 3;
//                dogs[2] = 3;
//
