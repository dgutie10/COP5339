package q8_1;

/**
 * Invariant: Name most not equal an empty string or null value at any time.
 */
public class Eraser implements Tool {
    private final String name;

    /**
     * Creates Eraser object with name given on construction.
     * @param name Name of new Eraser.
     * @throws IllegalArgumentException if name is an empty sting or null value.
     */
    public Eraser(String name) throws IllegalArgumentException{
        if (!legalArgumentCheck(name)) {
            throw new IllegalArgumentException("The name is set to invalid value " + name);
        }
        this.name = name;
        assert  legalArgumentCheck(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName(){ return name; }

    /**
     * {@inheritDoc}
     */
    @Override
    public void use() throws IllegalArgumentException {
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
