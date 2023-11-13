import java.util.ArrayList;

public class BasicFreightWagon extends Wagon implements Wagons {

    private String loader;
    private boolean hasVentilation;

    public BasicFreightWagon(String wagonType, int weight, int number, Locomotive assignedToLocomotive, boolean hasCargo, String loader, boolean hasVentilation) {
        super(wagonType, weight, number, assignedToLocomotive, hasCargo);
        this.loader = loader;
        this.hasVentilation = hasVentilation;
    }

    public String getLoader() {
        return loader;
    }

    public boolean isHasVentilation() {
        return hasVentilation;
    }

    public static void createBasicFreightWagons(ArrayList<Wagon> wagons) {
        wagons.add(new BasicFreightWagon("Basic freight wagon", 4000, 1,  null, true,"Roof hatches", true));
        wagons.add(new BasicFreightWagon("Basic freight wagon", 3000,  2,  null, true, "Doors on the sides of the wagon", false));
        wagons.add(new BasicFreightWagon("Basic freight wagon", 2000,  3,  null, true, "Conveyor", true));
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(", Loader: " + getLoader() + ", Has ventilation: " + isHasVentilation());
    }
}
