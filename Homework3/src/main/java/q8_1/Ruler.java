package q8_1;

public class Ruler implements Tool {
    private final String name;

    public Ruler(String name){ this.name = name;}

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void use() {
        System.out.println("Using " + this.getClass().getSimpleName() + ": " + name);
    }
}
