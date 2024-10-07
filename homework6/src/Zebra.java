public class Zebra extends Animal {
    // Public field
    public boolean is_wild;

    // Constructor
    public Zebra(int age, String gender, boolean is_wild) {
        super(age, gender);  // Call to Animal's constructor
        this.is_wild = is_wild;
    }

    // Public method
    public void run() {
        System.out.println("This Zebra is running.");
    }
}

