package surprise;

import java.util.Random;

public final class GatherSurprises {
    private static int totalTypesOfSurprises =3;
    private static final Random randomGen = new Random();

     private GatherSurprises(){}

    public static ISurprise[] gather(int n){
        ISurprise[] surpriseList =new ISurprise[n];

        for ( int i = 0; i < n; i++) {
            surpriseList[i]=(GatherSurprises.gather());
        }

     return  surpriseList;
    }

    public static ISurprise gather (){
        ISurprise surprise = null;
         int typeOfSurprise = randomGen.nextInt(totalTypesOfSurprises);
         switch (typeOfSurprise) {
             case 0:
                 surprise = FortuneCookie.generate();
                 break;
             case 1:
                 surprise = Candies.generate();
                 break;
             case 2:
                 surprise = MinionToy.generate();
                 break;
         }

        return  surprise;
    }
}
