package q8_1;

import java.util.HashMap;
import java.util.Map;

public class ToolboxImpl implements Toolbox {
    private static Map<String, Tool> toolbox = new HashMap<>();

    /**
     * {@inheritDoc}
     */
    @Override
    public void add(Tool tool) {
        if (tool == null ) throw new NullPointerException("Parameter tool is set to null");
        toolbox.put(tool.getName(), tool);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tool get(String toolName) {
        Tool tool =  toolbox.get(toolName);
        if (tool == null){
            System.out.println("Tool is not in toolbox");
            return null;
        } else return tool;
    }
}
