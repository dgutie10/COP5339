package q8_1;

/**
 * Inveriant: The objects on toolbox can't not be null.
 */
public interface Toolbox {
    /**
     * Add new Tool to to the Toolbox HashMap
     * @precondition Tool != Null
     * @param tool Tool object to be added to the tool box.
     * @throws NullPointerException if the tool object that is being added is null.
     */
    void add(Tool tool);

    /**
     * Gets Tool from Toolbox HaspMa
     * @precondition None of the tools in the HashMap are set to Null.
     * @param toolName String of the name of the requsted tool.
     * @return Tool of obejct to be requested.
     */
    Tool get(String toolName);
}
