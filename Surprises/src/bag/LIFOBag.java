package bag;

import surprise.ISurprise;

import java.util.ArrayList;
import java.util.Arrays;

public class LIFOBag implements IBag {

    ArrayList<ISurprise> surprises;

    public LIFOBag() {
        surprises = new ArrayList<>();
    }

    @Override
    public void put(ISurprise newSurprise) {
        this.surprises.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        for ( int i = 1 ; i<= surprises.size(); ){

            ISurprise nextSurprise = bagOfSurprises.takeOut();
            this.put(nextSurprise);
        }
    }

    @Override
    public ISurprise takeOut() {

        return this.surprises.remove(surprises.size()-1);
    }

    @Override
    public void put(ISurprise[] surpriseArrayList) {
        surprises.addAll(Arrays.asList(surpriseArrayList));
    }

    @Override
    public boolean isEmpty() {
        return this.surprises.isEmpty();
    }

    @Override
    public int size() {
        return surprises.size();
    }

    @Override
    public String toString() {
        return "LIFOBag{" + "surprises=" + surprises + '}';
    }

}
