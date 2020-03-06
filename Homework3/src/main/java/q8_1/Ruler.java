package q8_1;

/**
 * Invariant: Name most not equal an empty string or null value at any time.
 */
public class Ruler implements Tool {
    private final String name;

    /**
     * Creates Pencil object with name given on construction.
     * @param name Name of new Pencil.
     * @throws IllegalArgumentException if name is an empty sting or null value.
     */
    public Ruler(String name){
        if (!legalArgumentCheck(name)) {
            throw new IllegalArgumentException("The name is set to invalid value " + name);
        }
        this.name = name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void use() {
        System.out.println("Using " + this.getClass().getSimpleName() + ": " + name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean legalArgumentCheck(String name) {
        return (name != null || name.length() > 0);
    }
}
