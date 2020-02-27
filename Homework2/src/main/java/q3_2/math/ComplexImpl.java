package q3_2.math;


/**
 * Invariable: Both values for both real and imaginary most not equal 0 at any momment.
 */
public class ComplexImpl implements Complex{

    private final double real;
    private final double imaginary;

    /**
     * Creates new complex number object.
     * @param real Real number in the object.
     * @param imaginary Imaginary number.
     */
    public ComplexImpl (double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;

        assert this.isComplexNumber(real, imaginary);
    }

    /**
     * Creates Complex number without an imaginary number in the object.
     * Defaults imginaty value to 0.
     * @param real Real number value in the object.
     */
    public ComplexImpl (double real){
        this.imaginary = 0;
        this.real = real;

        assert isComplexNumber(real, imaginary);
    }

    /**
     * {@inheritDoc}
     */
    public String toString(){
        if (imaginary >= 0) {
            return real + "+" + imaginary + "i";
        } else {
            return  real + "" + imaginary + "i";
        }
    }

    /**
     * {@inheritDoc}
     */
    public double r() { return  real; }

    /**
     * {@inheritDoc}
     */
    public double i(){ return  imaginary; }

    /**
     * {@inheritDoc}
     */
    public ComplexImpl add (Complex x){
        if (x == null){
            throw new NullPointerException("The parameter provided is null");
        }
        double resultReal;
        double resultImaginary;

        resultReal = real + x.r();
        resultImaginary = imaginary + x.i();

        return new ComplexImpl(resultReal, resultImaginary);
    }

    /**
     * {@inheritDoc}
     */
    public ComplexImpl sub (Complex x){
        if (x == null){
            throw new NullPointerException("The parameter provided is null");
        }

        double resultReal;
        double resultImaginary;

        resultReal = real - x.r();
        resultImaginary = imaginary - x.i();

        return new ComplexImpl(resultReal, resultImaginary);
    }

    /**
     * {@inheritDoc}
     */
    public ComplexImpl mult(Complex x){
        if (x == null){
            throw new NullPointerException("The parameter provided is null");
        }

        double resultReal;
        double resultImaginary;

        resultImaginary = (real * x.i()) + (imaginary * x.r());
        resultReal = imaginary * x.i() * -1;
        resultReal = resultReal + (real * x.r());

        assert this.isComplexNumber(resultReal, resultImaginary);
        return  new ComplexImpl( resultReal, resultImaginary);
    }

    /**
     * {@inheritDoc}
     */
    public boolean equals (Complex x){
        if (x == null){
            throw new NullPointerException("The parameter provided is null");
        }
        return (x.r() == real) && (x.i() == imaginary);
    }


    /**
     * {@inheritDoc}
     */
    public boolean isComplexNumber(double real, double imaginary){
        return real != 0 || imaginary != 0;
    }

}
