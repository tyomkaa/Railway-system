import java.util.ArrayList;

public class ExplosiveWagon extends HeavyFreightWagon implements Wagons {

    private int maxExplosiveContainers;

    public ExplosiveWagon(String wagonType, int weight, int number, Locomotive assignedToLocomotive, boolean hasCargo, String typeOfBrakingSystem, String typeOfSuspension, int maxExplosiveContainers) {
        super(wagonType, weight, number, assignedToLocomotive, hasCargo, typeOfBrakingSystem, typeOfSuspension);
        this.maxExplosiveContainers = maxExplosiveContainers;
    }

    public int getMaxExplosiveContainers() {
        return maxExplosiveContainers;
    }

    public static void createExplosiveWagons(ArrayList<Wagon> wagons) {
        wagons.add(new ExplosiveWagon("Explosive wagon", 4000, 1,  null, true, "Pneumatic", "Stiff", 30));
        wagons.add(new ExplosiveWagon("Explosive wagon", 3000,  2,  null, true, "Hydraulic", "Movable", 20));
        wagons.add(new ExplosiveWagon("Explosive wagon", 2000,  3,  null, true, "Pneumatic", "Stiff", 10));
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(", Type of braking system: " + getTypeOfBrakingSystem() + ", Type of suspension: " + getTypeOfSuspension() + ", Max explosive containers: " + getMaxExplosiveContainers());
    }
}
