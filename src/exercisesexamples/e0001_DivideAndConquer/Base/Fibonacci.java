package exercisesexamples.e0001_DivideAndConquer.Base;

import algorithmtemplates.DivideAndConquerable;

import java.util.Vector;

public class Fibonacci implements DivideAndConquerable<Integer> {

    private int index;

    public Fibonacci(int index){
        this.index = index;
    }

    @Override
    public boolean isBase() {
        return index == 0 || index == 1;
    }

    @Override
    public Integer baseFun() {
        return 1;
    }

    @Override
    public Vector<DivideAndConquerable<Integer>> decompose() {
        Vector<DivideAndConquerable<Integer>> components = new Vector<>(2);

        components.add(new Fibonacci(index - 2));
        components.add(new Fibonacci(index - 1));

        return components;
    }

    @Override
    public Integer recompose(Vector<Integer> intermediateresults) {
        int sum = 0;
        for(int intermediateresult : intermediateresults){
            sum += intermediateresult;
        }
        return sum;
    }
}

