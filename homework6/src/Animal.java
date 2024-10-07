public class Animal {
    // Fields
    public int age;
    public String gender;

    // Constructor
    public Animal(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    // Methods
    public boolean isMammal() {
        System.out.println("This animal is a mammal.");
        return true; // You can add more logic here
    }

    public void mate() {
        System.out.println("This animal is mating.");
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Creating objects
        Animal myAnimal = new Animal(5, "Male");
        Fish myFish = new Fish(2, "Female", 3);
        Zebra myZebra = new Zebra(3, "Female", true);

        // Calling public methods
        myAnimal.isMammal();
        myAnimal.mate();
        
        myZebra.run();
    }
}