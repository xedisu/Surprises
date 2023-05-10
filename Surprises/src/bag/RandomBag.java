package bag;

import surprise.ISurprise;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class RandomBag implements IBag {

    ArrayList<ISurprise> surprises;

    public RandomBag () {
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
        Random randomGen = new Random();
        int nextIndex = randomGen.nextInt(this.surprises.size());

        return this.surprises.remove(nextIndex);
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

}
