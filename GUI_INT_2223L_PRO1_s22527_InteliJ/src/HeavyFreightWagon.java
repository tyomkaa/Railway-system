import java.util.ArrayList;

public class HeavyFreightWagon extends Wagon implements Wagons {

    private String typeOfBrakingSystem;
    private String typeOfSuspension;

    public HeavyFreightWagon(String wagonType, int weight, int number, Locomotive assignedToLocomotive, boolean hasCargo, String typeOfBrakingSystem, String typeOfSuspension) {
        super(wagonType, weight, number, assignedToLocomotive, hasCargo);
        this.typeOfBrakingSystem = typeOfBrakingSystem;
        this.typeOfSuspension = typeOfSuspension;
    }

    public String getTypeOfBrakingSystem() {
        return typeOfBrakingSystem;
    }

    public String getTypeOfSuspension() {
        return typeOfSuspension;
    }

    public static void createHeavyFreightWagons(ArrayList<Wagon> wagons) {
        wagons.add(new HeavyFreightWagon("Heavy freight wagon", 4000, 1,  null, true, "Pneumatic", "Stiff"));
        wagons.add(new HeavyFreightWagon("Heavy freight wagon", 3000,  2,  null, true, "Hydraulic", "Movable"));
        wagons.add(new HeavyFreightWagon("Heavy freight wagon", 2000,  3,  null, true, "Pneumatic", "Stiff"));
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(", Type of braking system: " + getTypeOfBrakingSystem() + ", Type of suspension: " + getTypeOfSuspension());
    }
}
