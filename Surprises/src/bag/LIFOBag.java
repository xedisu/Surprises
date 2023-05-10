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
        while (!bagOfSurprises.isEmpty()) {
            this.put(bagOfSurprises.takeOut());
        }
    }

    @Override
    public void put(ISurprise[] surpriseArrayList) {
        surprises.addAll(Arrays.asList(surpriseArrayList));
    }

    @Override
    public ISurprise takeOut() {
        return surprises.isEmpty() ? null : surprises.remove(surprises.size() - 1);
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
