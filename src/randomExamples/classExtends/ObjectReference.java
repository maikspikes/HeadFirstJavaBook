package randomExamples.classExtends;

public class ObjectReference {
        public static void main(String[] args) {
        /*
        Don’t panic. We’re not making a
        new Animal object; we’re making a
        new array object, of type Animal.
        (Remember, you cannot make a new
        instance of an abstract type, but
        you CAN make an array object
        declared to HOLD that
         */
            Animal[] animals = new Animal[5];
            animals[0] = new Dog();
            animals[1] = new Cat();
            animals[2] = new Wolf();
            animals[3] = new Hippo();
            animals[4] = new Lion();
        }

        private static class Animal {
        }

        private static class Dog extends Animal {
        }

        private static class Cat extends Animal {
        }

        private static class Wolf extends Animal {
        }

        private static class Hippo extends Animal {
        }

        private static class Lion extends Animal {
        }
    }
