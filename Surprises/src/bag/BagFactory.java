package bag;


public  class BagFactory implements IBagFactory{

    public IBag newBag;
    @Override
    public IBag makeBag(String type) {
        switch (type) {

            case "FIFO":
                newBag = new FIFOBag();
                break;
            case "LIFO":
                newBag = new LIFOBag();
                break;
            case "RANDOM":
            newBag= new RandomBag();
            break;
        }

        return newBag;
    }

    public static BagFactory getInstance() {
        return new BagFactory();
    }
}
