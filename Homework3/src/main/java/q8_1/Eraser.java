package q8_1;

public class Eraser implements Tool {
    private final String name;

    public Eraser(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void use() {
        System.out.println("Using " + this.getClass().getSimpleName() + ": " + name);
    }
}
