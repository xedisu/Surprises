package bag;

import surprise.ISurprise;

import java.util.ArrayList;
import java.util.Arrays;

public class FIFOBag implements IBag {
    ArrayList<ISurprise> surprises;

    public FIFOBag() {
        surprises = new ArrayList<>();
    }

    @Override
    public void put(ISurprise newSurprise) {
        surprises.add(newSurprise);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        while (!bagOfSurprises.isEmpty()) {
            put(bagOfSurprises.takeOut());
        }
    }

    @Override
    public void put(ISurprise[] surpriseArrayList) {
        surprises.addAll(Arrays.asList(surpriseArrayList));
    }

    @Override
    public ISurprise takeOut() {
        return surprises.isEmpty() ? null : surprises.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return surprises.isEmpty();
    }

    @Override
    public int size() {
        return surprises.size();
    }

    @Override
    public String toString() {
        return "FIFOBag{" + "surprises=" + surprises + '}';
    }
}
