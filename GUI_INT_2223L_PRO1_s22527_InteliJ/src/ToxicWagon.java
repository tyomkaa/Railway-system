import java.util.ArrayList;

public class ToxicWagon extends HeavyFreightWagon implements Wagons {

    private String toxicityLevel;

    public ToxicWagon(String wagonType, int weight, int number, Locomotive assignedToLocomotive, boolean hasCargo, String typeOfBrakingSystem, String typeOfSuspension, String toxicityLevel) {
        super(wagonType, weight, number, assignedToLocomotive, hasCargo, typeOfBrakingSystem, typeOfSuspension);
        this.toxicityLevel = toxicityLevel;
    }

    public String getToxicityLevel() {
        return toxicityLevel;
    }

    public static void createToxicWagons(ArrayList<Wagon> wagons) {
        wagons.add(new ToxicWagon("Toxic wagon", 4000, 1,  null, true, "Pneumatic", "Stiff", "MAX"));
        wagons.add(new ToxicWagon("Toxic wagon", 3000,  2,  null, true, "Hydraulic", "Movable", "MEDIUM"));
        wagons.add(new ToxicWagon("Toxic wagon", 2000,  3,  null, true, "Pneumatic", "Stiff", "LOW"));
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(", Type of braking system: " + getTypeOfBrakingSystem() + ", Type of suspension: " + getTypeOfSuspension() + ", Toxicity level: " + getToxicityLevel());
    }
}
