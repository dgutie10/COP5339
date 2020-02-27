import org.junit.Assert;
import org.junit.Test;
import q3_2.math.Complex;
import q3_2.math.ComplexImpl;

public class TestComplex {


    @Test
    public void testAdd(){
        System.out.println("Running test add...");
        double a = 1, b = 2, c = -3, d = 4;
        double e = a + c, f = b + d;
        ComplexImpl x = new ComplexImpl(a,b);
        ComplexImpl y = new ComplexImpl(c,d);
        ComplexImpl w = x.add(y);
        ComplexImpl z = new ComplexImpl(e,f);
        // set up Complex objects
        // test condition using the Complex equals() method:
        Assert.assertTrue(z.equals(w));
    }

    @Test
    public void testAddWithNoImaginaryNumber(){
        System.out.println("Running test add without an imaginary number...");
        double a = 1, b = 2;
        double e = a + b;
        ComplexImpl x = new ComplexImpl(a);
        ComplexImpl y = new ComplexImpl(b);
        ComplexImpl w = x.add(y);
        ComplexImpl z = new ComplexImpl(e);

        Assert.assertTrue(z.equals(w));
    }

    @Test
    public void testSub(){
        System.out.println("Running test sub...");
        double a = 1, b = 2, c = -3, d = 4;
        double e = a + c, f = b + d;
        ComplexImpl x = new ComplexImpl(a,b);
        ComplexImpl y = new ComplexImpl(c,d);
        ComplexImpl w = x.add(y);
        ComplexImpl z = new ComplexImpl(e,f);
        // set up Complex objects
        // test condition using the Complex equals() method:
        Assert.assertTrue(z.equals(w));
    }

    @Test
    public void testSubWithNoImaginaryNumber(){
        System.out.println("Running test sub without imaginary number...");
        double a = 1, b = 2;
        double e = a - b;
        ComplexImpl x = new ComplexImpl(a);
        ComplexImpl y = new ComplexImpl(b);
        ComplexImpl w = x.sub(y);
        ComplexImpl z = new ComplexImpl(e);

        Assert.assertTrue(z.equals(w));
    }

    @Test
    public void testMult() {
        System.out.println("Running test mult...");
        double a = 1, b = 2, c = -3, d = 4;
        double e = (a * c) + (b * d * -1);
        double f = (a * d) + (b * c);

        ComplexImpl x = new ComplexImpl(a, b);
        ComplexImpl y = new ComplexImpl(c,d);
        ComplexImpl w = x.mult(y);
        ComplexImpl z = new ComplexImpl(e,f);

        Assert.assertTrue(z.equals(w));
    }

    @Test
    public void testMultNoImaginaryNumber(){
        System.out.println("Running test mult without imaginary number...");
        double a = 1, c = -3;
        double e = (a * c) ;

        ComplexImpl x = new ComplexImpl(a);
        ComplexImpl y = new ComplexImpl(c);
        ComplexImpl w = x.mult(y);
        ComplexImpl z = new ComplexImpl(e);

        Assert.assertTrue(z.equals(w));
    }

    @Test
    public void testToString(){
        System.out.println("Running test toString...");
        double a = 1, b = 2;
        String expectedStr = a + "+" + b + "i";

        ComplexImpl x = new ComplexImpl(a,b);
        String testStr = x.toString();

        Assert.assertEquals(expectedStr, testStr);
    }

    @Test
    public void testToStringNoImaginaryNumber(){
        System.out.println("Running test toString without imaginary number...");
        double a = 1;
        String expectedStr = a + "+" + 0.0 + "i";

        ComplexImpl x = new ComplexImpl(a);
        String testStr = x.toString();

        Assert.assertEquals(expectedStr, testStr);
    }

    @Test
    public void testToStringWithNegativeImaginaryNumber(){
        System.out.println("Running test toString with negative imaginary number...");
        double a = -1, b = -1;
        String expectedStr = a + "" + b + "i";

        ComplexImpl x = new ComplexImpl(a,b);
        String testStr = x.toString();

        Assert.assertEquals(expectedStr, testStr);
    }

    @Test
    public void  testIsComplexNumber(){
        System.out.println("Running test isComplexNumber...");
        ComplexImpl complex = new ComplexImpl(1,2);
        Assert.assertTrue(complex.isComplexNumber(complex.r(), complex.i()));
    }

    @Test(expected = NullPointerException.class)
    public void testAddNullPointerException(){
        System.out.println("Running test testAddNullPointerException...");
        double a = 1, b = 2;
        ComplexImpl x = new ComplexImpl(a,b);
        ComplexImpl y = null;

        x.add(y);
    }

    @Test(expected = NullPointerException.class)
    public void testSubNullPointerException(){
        System.out.println("Running test testSubNullPointerException...");
        double a = 1, b = 2;
        ComplexImpl x = new ComplexImpl(a,b);
        ComplexImpl y = null;

        x.sub(y);
    }

    @Test(expected = NullPointerException.class)
    public void testMultNullPointerException(){
        System.out.println("Running test testMultNullPointerException...");
        double a = 1, b = 2;
        ComplexImpl x = new ComplexImpl(a,b);
        ComplexImpl y = null;

        x.mult(y);
    }

    @Test(expected = NullPointerException.class)
    public void testEqualsNullPointerException(){
        System.out.println("Running test testEqualsNullPointerException...");
        double a = 1, b = 2;
        ComplexImpl x = new ComplexImpl(a,b);
        ComplexImpl y = null;

        x.equals(y);
    }




}
