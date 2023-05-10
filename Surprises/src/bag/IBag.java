package bag;

import surprise.ISurprise;

public interface IBag {
    // adds a surprise in the bag
    void put(ISurprise newSurprise);

    // adds all the surprises from another bag.IBag
    //   -> the 'bagOfSurprises' will be empty() afterwards
    void put(IBag bagOfSurprises);

    // removes a surprise from the bag and returns it
    ISurprise takeOut();

    void put(ISurprise[] surpriseArrayList);

    // Checks if the bag is empty or not
    boolean isEmpty();

    // Returns the number of surprises
    int size();
}