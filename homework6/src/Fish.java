public class Fish extends Animal {
    // Private field
    private int sizeInFeet;

    // Constructor
    public Fish(int age, String gender, int sizeInFeet) {
        super(age, gender);  // Call to Animal's constructor
        this.sizeInFeet = sizeInFeet;
    }

    // Private method
    private void canEat() {
        System.out.println("This is a private method canEat() from class Fish.");
    }

    // Example of calling private method inside the class
    public void displayCanEat() {
        canEat();
    }
}