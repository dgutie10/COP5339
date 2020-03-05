package q8_1;

import java.util.HashMap;
import java.util.Map;

public class ToolboxImpl implements Toolbox {
    private static Map<String, Tool> toolbox = new HashMap<>();


    @Override
    public void add(Tool tool) {
        toolbox.put(tool.getName(), tool);
    }

    @Override
    public Tool get(String toolName) {
        return toolbox.get(toolName);
    }
}
