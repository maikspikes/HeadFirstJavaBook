package randomExamples.objectReference;

import OOPExercises.dog.Dog;

import java.util.ArrayList;

public class ObjectReference {
    public static void main(String[] args) {
        ArrayList<Dog> myDogArrayList = new ArrayList<Dog>();
        Dog aDog = new Dog(80, "pitbull", "Manuel");
        myDogArrayList.add(aDog);
        Dog d = myDogArrayList.get(0);
        d.bark();


        //Does not work. Returns object.
//        ArrayList<Object> myDogArrayList = new ArrayList<Object>();
//        Dog aDog = new Dog(80, "pitbull", "Manuel");
//        myDogArrayList.add(aDog);
//        Dog d = myDogArrayList.get(0);


    }
}


