package q8_1;

public class ToolTest {
    public static void main(String[] args) {
        ToolboxImpl toolbox = new ToolboxImpl();
        toolbox.add(new Pencil("Number 2"));
        toolbox.add(new Eraser("Dry"));
        toolbox.add(new Ruler("Metric"));

        toolbox.get("Dry").use();
        toolbox.get("Number 2").use();
        toolbox.get("Metric").use();
    }
}
