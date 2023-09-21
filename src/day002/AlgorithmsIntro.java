package day002;

public class AlgorithmsIntro {


    /**
     *
     *  We can define an algorithm by describing a procedure for solving a problem in a natural language,
     *  or by writing a computer program that implements the procedure, as shown below for Euclid’s algorithm
     *  for finding the greatest common divisor of two numbers
     *
     *
     */

    /**
     *
     * Description of Greatest Common Divisor problem:
     *
     *Compute the greatest common divisor of two nonnegative integers p and q as follows:
     * If q is 0, the answer is p.
     * If not, divide p by q and take the remainder r.
     * The answer is the greatest common divisor of q and r.
     *
     */

    public static int greatestCommonDivisor(int p, int q){
        if(q==0)
            return p;

        int r = p % q;
        return greatestCommonDivisor(q,r);


    }

    public static void main(String[] args) {

        System.out.println(greatestCommonDivisor(24,14));


    }
}
