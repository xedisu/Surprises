package surpriseGiving;

import bag.IBag;

public class GiveSurpriseAndApplause extends AbstractGiveSurprises {

    public GiveSurpriseAndApplause(String type, int waitTime){
        super(type,waitTime);
    }

    @Override
    public void giveWithPassion() {
        System.out.println("Loud applause to you... For it is in giving that we receive.");
    }
}
