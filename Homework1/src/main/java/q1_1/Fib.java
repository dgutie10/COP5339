package q1_1;

public class Fib {
    private int f0;
    private int f1;
    private int current;
    private int prev0;
    private int prev1;

    /***
     * Object constructor. Initializes and prints the starting points.
     * @param f0 Initial point n-1
     * @param f1 Initial point n-2
     */

    public Fib(int f0, int f1) {
        this.f0 = f0;
        this.f1 = f1;

        System.out.println("Fib start values: \n" + f0 + "\n" + f1);
    }

    /**
     * computes F(n) using an recursive algorithm,
     * where F(n) = F(n-1) + F(n-2) is the recursive definition.
     * @param n number in the sequence to be found
     * @return the next n value to be found
     * @throws Exception if n is negative
     */
    public int fRec(int n) throws Exception {
        if (n < 0) {
            throw new Exception("Error | The value provided is less than 0 ");
        }
        if (n <= 1) {
            return n;
        }
        current = prev1 + prev0;
        prev0 = prev1;
        prev1 = current;
        return fRec(n - 1);
    }


    /**
     * Computes F(n) using the iterative algorithm, where
     * F(n) = F(n-1) + F(n-2) is the recursive definition.
     * @param n The number in sequence to be calculated.
     * @return The fibonacci number fot the n number in the sequence.
     * @throws Exception if n is negative
     */
    public int f(int n) throws Exception{
        if (n < 0) {
            throw new Exception("Error | The value provided is less than 0 ");
        }
        if (n <= 2 ){
            return current;
        }

        for ( int x = 1 ; x < n ; x++){
            current = prev1 + prev0;
            prev0 = prev1;
            prev1 = current;
        }
        return current;
    }

    /**
     * Resets the calculation values to the stating points f0 and f1
     */
    public void resetValues(){
        this.prev0 = this.f0;
        this.prev1 = this.f1;
        this.current = this.f0 + this.f1;
    }


    public static void main(String[] args) throws Exception {
        int f0 = Integer.parseInt(args[0]);
        int f1 = Integer.parseInt(args[1]);
        int n = Integer.parseInt(args[2]);
        System.out.println(n);

        Fib fib = new Fib (f0,f1);

        for (int f = 2 ; f < n ; f++ ){
            fib.resetValues();
            fib.fRec(f);
            System.out.println("Recursive: " + fib.current);
            fib.resetValues();
            System.out.println("Iterative: "+ fib.f(f));
        }
    }

}


