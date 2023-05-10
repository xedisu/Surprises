package surprise;

public class MinionToy implements ISurprise {
    private static final String[] names = {"Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"};

    private static int nextMinionName = 0;
    private final String name;

    MinionToy(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nMinionToy {" + name + "}";
    }

    @Override
    public void enjoy() {
        System.out.println("You got a minion named " + name + "!");
    }

    public static MinionToy generate() {
        MinionToy newToy = new MinionToy(names[nextMinionName]);
        nextMinionName++;

        if (nextMinionName == names.length - 1) {
            nextMinionName = 0;
        }

        return newToy;
    }
}
