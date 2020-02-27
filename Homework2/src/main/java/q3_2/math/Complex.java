package q3_2.math;

public interface Complex {

    /**
     * Print the complex number in string from as the formula.
     * @precondition imaginary != 0 && real != 0.
     * @return Complex number in string form "a + bi".
     * @exception throws exception if
     **/
    String toString();

    /**
     * Accessor for the real number variable.
     * @precondition  real == 0.
     * @return Real number value.
     */
    double r();

    /**
     * Accessor function for the imaginary variable
     * @precondition imaginary != 0 && real != 0.
     * @return Imaginary number value.
     */
    double i();

    /**
     * Add function between two Complex number following formula:
     * (a + bi) + (c + di) = a + b + bi + ci
     * @precondition Complex x != null.
     * @param x Complex number object to be added.
     * @return Complex number object with the result of the operation.
     * @postcondition resultReal != 0 && resultImaginary != 0.
     * @throws NullPointerException if param x == null.
     */
    Complex add (Complex x);
   
    /**
     * Substraction function between two Complex number following formula:
     * (a + bi) - (c + di) = a - b - bi - ci
     * @precondition  Complex x != null.
     * @param x Complex number object to be Substracted.
     * @return Complex number object with the result of the operation.
     * @postcondition resultReal != 0 && resultImaginary != 0.
     * @throws NullPointerException if param x == null.
     */
    Complex sub (Complex x);

    /**
     * Multiplication function between two Complex number following formula:
     * (a + bi) * (c + di) = (a * c) + (a * di) + (c * bi) + (bi * di)
     * @precondition  Complex x != null.
     * @param x Complex number object to be multiplied.
     * @return Complex number object with the result of the operation.
     * @postcondition resultReal != 0 && resultImaginary != 0.
     * @throws NullPointerException if param x == null.
     */
    Complex mult(Complex x);

    /**
     * Copares the value of 2 complex number objects.
     * @precondition  Complex x != null.
     * @param x Complex number object to be compared.
     * @return Bolean with the result of equality comparison.
     * @throws NullPointerException if param x == null.
     */
    boolean equals (Complex x);

    /**
     * Invariant check if the object still qualifies as a Complex number.
     * or the result of any operation also qualifies as a Complex number.
     * Invarianrt: real != 0 && imiginary != 0
     * @return true if both values are equal to 0.
     */
    boolean isComplexNumber(double real, double imaginary);

}
