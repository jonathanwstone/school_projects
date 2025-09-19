import java.util.*;

public class FibFormula implements FindFib {

    // Override calculate Fib
    @Override
    public int calculateFib(int n){
        int fib = (int) (((1+Math.sqrt(5))/2)-((1-Math.sqrt(5))/2)/Math.sqrt(5));
        return fib;
    }

}
