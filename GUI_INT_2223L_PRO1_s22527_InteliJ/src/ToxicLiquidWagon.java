import java.util.ArrayList;

public class ToxicLiquidWagon extends LiquidWagon implements Wagons {

    private String typeOfLiquid;

    public ToxicLiquidWagon(String wagonType, int weight, int number, Locomotive assignedToLocomotive, boolean hasCargo, String loader, boolean hasVentilation, int tankCapacity, String typeOfLiquid) {
        super(wagonType, weight, number, assignedToLocomotive, hasCargo, loader, hasVentilation, tankCapacity);
        this.typeOfLiquid = typeOfLiquid;
    }

    public String getTypeOfLiquid() {
        return typeOfLiquid;
    }

    public static void createToxicLiquidWagons(ArrayList<Wagon> wagons) {
        wagons.add(new ToxicLiquidWagon("Toxic liquid wagon", 4000, 1,  null, true, "Roof hatches", true, 30, "Snake poison"));
        wagons.add(new ToxicLiquidWagon("Toxic liquid wagon", 3000,  2,  null, true, "Doors on the sides of the wagon", false, 20, "Oil"));
        wagons.add(new ToxicLiquidWagon("Toxic liquid wagon", 2000,  3,  null, true, "Conveyor", true, 10, "Acid"));
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(", Loader: " + getLoader() + ", Has ventilation: " + isHasVentilation() + ", Tank capacity: " + getTankCapacity() + ", Type of liquid: " + getTypeOfLiquid());
    }
}
