package exercisesexamples.e0001_DivideAndConquer.Smart;

import algorithmtemplates.DivideAndConquerable;

import java.util.ArrayList;
import java.util.Vector;

public class FibonacciSmart implements DivideAndConquerable<Integer> {

    private int index;
    private ArrayList<Integer> memory;

    public FibonacciSmart(int index, ArrayList<Integer> memory){
        this.index = index;
        this.memory = memory;
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
        components.add(new FibonacciSmart(index - 2, memory));
        components.add(new FibonacciSmart(index - 1, memory));
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

    @Override
    public Integer divideAndConquer(){
        if(isBase()){
            return baseFun();
        }
        Vector<DivideAndConquerable<Integer>> subcomponents = decompose();
        Vector<Integer> intermediateresults = new Vector<Integer>(subcomponents.size());
        for(DivideAndConquerable<Integer> subcomponent : subcomponents){
            Integer recalled = recall(subcomponent);
            if(recalled != null){
                intermediateresults.add(recalled);
            } else {
                intermediateresults.add(subcomponent.divideAndConquer());
            }
        }
        Integer recomposed = recompose(intermediateresults);
        memorize(this, recomposed);
        return recomposed;
    }


    public Integer recall(DivideAndConquerable<Integer> subcomponent){
        return null;
    }

    public void memorize(DivideAndConquerable<Integer> component, Integer value){

    }


}

