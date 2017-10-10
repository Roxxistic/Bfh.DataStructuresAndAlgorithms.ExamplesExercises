package implementations;

import DivideAndConquer.DivideAndConquerable;
import goldman.collection.positional.Array;

import java.util.Vector;

public class MergeSorter implements DivideAndConquerable<Array> {

    @Override
    public boolean isBase() {
        return false;
    }

    @Override
    public Array baseFun() {
        return null;
    }

    @Override
    public Vector<DivideAndConquerable<Array>> decompose() {
        return null;
    }

    @Override
    public Array recompose(Vector<Array> intermediateresults) {
        return null;
    }


     /*
 default OutputType divideAndConquer(){
 if(isBase()){
 return baseFun();
 }
 Vector<DivideAndConquerable<OutputType>> subcomponents = decompose();
 Vector<OutputType> intermediateresults = new Vector<OutputType>(subcomponents.size());
 subcomponents.forEach(
 subcomponent -> intermediateresults.add(subcomponent.divideAndConquer())
 );
 return recompose(intermediateresults);
 }
 */
}



/**
 package implementations;

 import DivideAndConquer.DivideAndConquerable;
 import goldman.collection.positional.Array;

 import java.util.Comparator;
 import java.util.Vector;

 public class MergeSorter implements DivideAndConquerable<Object[]> {
 private Object[] data;
 private Comparator<? super Object> comparator;

 public MergeSorter(
 Object[] data, // input to sort / sorted output
 Comparator<? super Object> comparator
 ){
 this.data = data;
 this.comparator = comparator;
 }

 @Override
 public boolean isBase() {
 return this.data.length <= 1;
 }

 @Override
 public Object[] baseFun() {
 return this.data;
 }

 @Override
 public Vector<DivideAndConquerable<Object[]>> decompose() {
 int leftCount = this.data.length / 2;
 int rightCount = this.data.length - leftCount;
 Object[] leftPart = new Object[leftCount];
 Object[] rightPart = new Object[rightCount];
 System.arraycopy(this.data,0,leftPart,0, leftCount);
 System.arraycopy(this.data, leftCount, rightPart, 0, rightCount);

 MergeSorter leftSorter = new MergeSorter(leftPart, this.comparator);
 MergeSorter rightSorter = new MergeSorter(rightPart, this.comparator);

 Vector<DivideAndConquerable<Object[]>> result = new Vector<>();
 result.add(leftSorter);
 result.add(rightSorter);

 return result;
 }

 @Override
 public Object[] recompose(Vector<Object[]> intermediateresults) {

 }


}


        */