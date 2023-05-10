import bag.*;
import surprise.GatherSurprises;
import surprise.ISurprise;
import surpriseGiving.AbstractGiveSurprises;
import surpriseGiving.GiveSurpriseAndApplause;
import surpriseGiving.GiveSurpriseAndHug;
import surpriseGiving.GiveSurpriseAndSing;

public class Main {
    public static void main(String[] args) {

        AbstractGiveSurprises giveSurpriseAndApplause = new GiveSurpriseAndApplause("FIFO", 5);
        AbstractGiveSurprises giveSurpriseAndSing = new GiveSurpriseAndSing("LIFO", 5);
        AbstractGiveSurprises giveSurpriseAndHug = new GiveSurpriseAndHug("RANDOM", 5);

        giveSurpriseAndApplause.put(GatherSurprises.gather(2));
        giveSurpriseAndApplause.giveAll();
        giveSurpriseAndApplause.give();



//        giveSurpriseAndSing.giveAll();


    }
}