package OOPExercises.dog;

public class Dog {
    private int size;
    private String breed;
    private String name;

    public Dog(int size, String breed, String name) {
        this.size = size;
        this.breed = breed;
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void bark(){
        System.out.println("ruff!");
    }
}
