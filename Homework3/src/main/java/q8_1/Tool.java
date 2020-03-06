package q8_1;

public interface Tool extends Cloneable {
    /**
     * Get the tool name that was set duting the class contrution.
     * @precondition Name !=  null && name != ""
     * @return String with name value.
     */
    String getName();

    /**
     * @precondition Name !=  null && name != ""
     * Prints to console "Using Tool: Name"
     */
    void use();

    /**
     * Invariant check if the name is a valid value.
     * @param name Name to be check for invariant.
     * @return Returns false is the invariant fails.
     */
    boolean legalArgumentCheck(String name);
}
