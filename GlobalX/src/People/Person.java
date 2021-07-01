package People;

/**
 * Creates a person object containing a first and last name
 * as a string
 */
public class Person {

    /**
     * First name of person
     */
    private String firstName = "";
    /**
     * Last name of person
     */
    private String lastName;

    /**
     * Creates a new person with a first and last name
     * @param firstName (String)
     * @param lastName (String)
     */
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    /**
     * Updates firstname of person
     * @param firstName (String) -
     *                     new firstName of person
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Updates lastName of person
     * @param lastName (String) -
     *                     new lastName of person
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
