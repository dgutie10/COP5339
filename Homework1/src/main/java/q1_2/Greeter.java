package q1_2;

public class Greeter {
    private String name;

    /**
     * Constructs a Greeter object that can greet a person or
     * entity.
     *
     * @param aName the name of the person or entity who should
     *              be addressed in the greetings.
     */
    public Greeter(String aName) {
        name = aName;
    }

    /**
     * Greet with a "Hello" message.
     *
     * @return a message containing "Hello" and the name of
     * the greeted person or entity.
     */
    public String sayHello() {
        return "Hello, " + name + "!";
    }

    /**
     * Modifies the value of name
     *
     * @param other The new value that will be set on the variable name
     */
    public void swapNames(String other) {
        name = other;
    }

    /**
     * Returen a new Greeter object with a new name
     *
     * @param qualifier Value to be set for private variable name
     * @return new Greeter object
     */
    public Greeter createQualifiedGreeter(String qualifier) {
        return new Greeter(qualifier);
    }
}