package exercisesexamples.e0001_DivideAndConquer.Concurrent;

import exercisesexamples.e0001_DivideAndConquer.Base.Fibonacci;
import exercisesexamples.e0001_DivideAndConquer.Concurrent.DivideAndConquerableConcurrently;

public class FibonacciConcurrently extends Fibonacci implements DivideAndConquerableConcurrently<Integer> {


    public FibonacciConcurrently(int index) {
        super(index);
    }
}

