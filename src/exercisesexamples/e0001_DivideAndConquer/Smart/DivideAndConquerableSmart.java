package exercisesexamples.e0001_DivideAndConquer.Smart;

import algorithmtemplates.DivideAndConquerable;
import goldman.collection.positional.Array;

import java.util.ArrayList;
import java.util.Vector;

public interface DivideAndConquerableSmart<OutputType> extends DivideAndConquerable<OutputType> {

    @Override
    default OutputType divideAndConquer(){
        if(isBase()){
            return baseFun();
        }
        Vector<DivideAndConquerable<OutputType>> subcomponents = decompose();
        Vector<OutputType> intermediateresults = new Vector<OutputType>(subcomponents.size());
        for(DivideAndConquerable<OutputType> subcomponent : subcomponents){
            OutputType recalled = recall(subcomponent);
            if(recalled != null){
                intermediateresults.add(recalled);
            } else {
                intermediateresults.add(subcomponent.divideAndConquer());
            }
        }
        OutputType recomposed = recompose(intermediateresults);
        memorize(this, recomposed);
        return recomposed;
    }

    abstract void memorize(DivideAndConquerable<OutputType> subcomponent, OutputType value);

    abstract OutputType recall(DivideAndConquerable<OutputType> component);
}
