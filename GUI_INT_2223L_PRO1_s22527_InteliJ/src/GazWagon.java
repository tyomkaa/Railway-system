import java.util.ArrayList;

public class GazWagon extends BasicFreightWagon implements Wagons {

    private int maxGazTanks;

    public GazWagon(String wagonType, int weight, int number, Locomotive assignedToLocomotive, boolean hasCargo, String loader, boolean hasVentilation, int maxGazTanks) {
        super(wagonType, weight, number, assignedToLocomotive, hasCargo, loader, hasVentilation);
        this.maxGazTanks = maxGazTanks;
    }

    public int getMaxGazTanks() {
        return maxGazTanks;
    }

    public static void createGazWagons(ArrayList<Wagon> wagons) {
        wagons.add(new GazWagon("Gaz wagon", 4000, 1,  null, true, "Roof hatches", true, 30));
        wagons.add(new GazWagon("Gaz wagon", 3000,  2,  null, true, "Doors on the sides of the wagon", false, 20));
        wagons.add(new GazWagon("Gaz wagon", 2000,  3,  null, true, "Conveyor", true, 10));
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(", Loader: " + getLoader() + ", Has ventilation: " + isHasVentilation() + ", Max gaz tanks: " + getMaxGazTanks());
    }
}
