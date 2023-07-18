package experiments;

public class References {
    public static void main(String[] args) {
        Example example1 = new Example();
        Example example2 = new Example();

        System.out.println("example 1 " + example1);
        System.out.println("example 2 " + example2);
        System.out.println("same memory address? " + (example1 == example2));


        example1 = example2;

        System.out.println("example 1 " + example1);
        System.out.println("example 2 " + example2);
        System.out.println("same memory address? " + (example1 == example2));


    }
}

class Example {}
