package DivideAndConquer;

import algorithmtemplates.DivideAndConquerable;

import java.util.Vector;

public interface DivideAndConquerableConcurrently<OutputType> extends DivideAndConquerable<OutputType> {

    @Override
    default OutputType divideAndConquer(){
        if(isBase()){
            return baseFun();
        }
        Vector<DivideAndConquerable<OutputType>> subcomponents = decompose();
        Vector<OutputType> intermediateresults = new Vector<OutputType>(subcomponents.size());
        // using parallel stream
        subcomponents.parallelStream().forEach(
                subcomponent -> intermediateresults.add(subcomponent.divideAndConquer())
        );
        return recompose(intermediateresults);
    }
}

