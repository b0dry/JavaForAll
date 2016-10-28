package hackerrank;

/**
 * Created by DDinkov on 20-Oct-16 4:18 PM.
 */
public class Person2 {
    private int age;

    public Person2(int initialAge) {
        if (initialAge < 0) {
            System.out.println("Age is not valid, setting age to 0.");
            this.age = 0;
        } else {
            this.age = initialAge;
        }
        // Add some more code to run some checks on initialAge
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        if (this.age < 13)
            System.out.println("You are young.");
        else if (age >= 13 && age < 18)
            System.out.println("You are a teenager.");
        else
            System.out.println("You are old.");

    }

    public void yearPasses() {
        // Increment this person's age.
        this.age++;
    }

}
