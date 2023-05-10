package surprise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Candies implements ISurprise {

   private final static ArrayList<String> candyType = new ArrayList<>(Arrays.asList("chocolate", "jelly", "fruits", "vanilla"));
    private static final Random randomGen = new Random();

    String type;
    int number;

    private Candies (int num, String type){
        this.type=type;
        this.number=num;
    }

    public static Candies generate(){

        int type = randomGen.nextInt(candyType.size());
        int number = randomGen.nextInt(101);

        return new Candies( number, candyType.get(type));

    }

    @Override
    public String toString() {
        return "\nCandies {" + "type='" + type + '\'' + " number=" + number + '}';
    }

    @Override
    public void enjoy() {
        System.out.println("You received "+ number+ " " + type + " candies");
    }
}
