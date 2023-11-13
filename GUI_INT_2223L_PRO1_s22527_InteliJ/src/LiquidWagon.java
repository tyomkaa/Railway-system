import java.util.ArrayList;

public class LiquidWagon extends BasicFreightWagon implements Wagons {

    private int tankCapacity;

    public LiquidWagon(String wagonType, int weight, int number, Locomotive assignedToLocomotive, boolean hasCargo, String loader, boolean hasVentilation, int tankCapacity) {
        super(wagonType, weight, number, assignedToLocomotive, hasCargo, loader, hasVentilation);
        this.tankCapacity = tankCapacity;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public static void createLiquidWagons(ArrayList<Wagon> wagons) {
        wagons.add(new LiquidWagon("Liquid wagon", 4000, 1,  null, true, "Roof hatches", true, 30));
        wagons.add(new LiquidWagon("Liquid wagon", 3000,  2,  null, true, "Doors on the sides of the wagon", false, 20));
        wagons.add(new LiquidWagon("Liquid wagon", 2000,  3,  null, true, "Conveyor", true, 10));
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(", Loader: " + getLoader() + ", Has ventilation: " + isHasVentilation() + ", Tank capacity: " + getTankCapacity());
    }
}
