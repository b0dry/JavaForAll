package hackerrank;

/**
 * Created by DDinkov on 28-Oct-16 9:47 AM.
 * https://www.hackerrank.com/challenges/30-inheritance
 */
class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + "\nID: " + idNumber);
    }


}
