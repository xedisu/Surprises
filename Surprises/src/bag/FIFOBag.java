package bag;

import surprise.ISurprise;

import java.util.ArrayList;
import java.util.Arrays;

public class FIFOBag implements IBag{

    ArrayList<ISurprise> surprises;

    public FIFOBag() {
        surprises = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "FIFOBag{" + "surprises=" + surprises + '}';
    }

    @Override
    public void put(ISurprise newSurprise) {
        this.surprises.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
       while ( !bagOfSurprises.isEmpty()) {

           ISurprise nextSurprise = bagOfSurprises.takeOut();
           this.put(nextSurprise);
       }
    }

    @Override
    public void put(ISurprise[] surpriseArrayList) {
        surprises.addAll(Arrays.asList(surpriseArrayList));
       }


    @Override
    public ISurprise takeOut() {
//        if (surprises.isEmpty()){
//            return null;
//        }
        return this.surprises.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return this.surprises.isEmpty();
    }

    @Override
    public int size() {
        return surprises.size();
    }

}