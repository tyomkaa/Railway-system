import java.util.ArrayList;

public class PostWagon extends Wagon implements Wagons {

    private int numOfMailboxes;
    private boolean requiresElectricity;

    public PostWagon(String wagonType, int weight, int number, Locomotive assignedToLocomotive, boolean hasCargo, int numOfMailboxes, boolean requiresElectricity) {
        super(wagonType, weight, number, assignedToLocomotive, hasCargo);
        this.numOfMailboxes = numOfMailboxes;
        this.requiresElectricity = requiresElectricity;
    }

    public int getNumOfMailboxes() {
        return numOfMailboxes;
    }

    public boolean isRequiresElectricity() {
        return requiresElectricity;
    }

    public static void createPostWagons(ArrayList<Wagon> wagons) {
        wagons.add(new PostWagon("Post", 4000, 1,  null, false, 50, true));
        wagons.add(new PostWagon("Post", 3000,  2,  null, false, 30, true));
        wagons.add(new PostWagon("Post", 2000,  3,  null, false, 20, true));
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(", Number of mailboxes: " + getNumOfMailboxes() + ", Requires electricity: " + isRequiresElectricity());
    }
}
