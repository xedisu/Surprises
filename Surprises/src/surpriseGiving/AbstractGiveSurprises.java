package surpriseGiving;

import bag.BagFactory;
import bag.IBag;
import surprise.ISurprise;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises {

    private  final BagFactory bagFactory = new BagFactory();
    private final IBag theBag;
    private final int waitTime;

   public  AbstractGiveSurprises (String typeOfBag, int waitTime){
        theBag = bagFactory.makeBag(typeOfBag);
        this.waitTime=waitTime;

    }

    public IBag getTheBag() {
        return theBag;
    }

    public  void put(ISurprise newSurprise) {
        theBag.put(newSurprise);
    }

  public   void put(IBag surprises) {
       while (!surprises.isEmpty()) {
           theBag.put(surprises);
       }
    }

    public void put(ISurprise[] surpriseArrayList) {
        theBag.put(surpriseArrayList);
    }

  public   void give() {
        if (theBag.isEmpty()) {
            return;
        }
        ISurprise theSurpriseGiven = theBag.takeOut();
        theSurpriseGiven.enjoy();
        giveWithPassion();
    }

  public   void giveAll() {
       while (!theBag.isEmpty()){
           give();
           // Sleep for X seconds - code snippet
           try {
               TimeUnit.SECONDS.sleep(waitTime); // number of seconds to sleep
           } catch (InterruptedException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
           }
       }
    }

  public   boolean isEmpty(){
      return theBag.isEmpty();
    }

    public abstract void giveWithPassion();
}
