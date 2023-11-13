import java.util.ArrayList;

public class PassengerWagon extends Wagon implements Wagons {

    private int maxNumberOfPassengers;
    private boolean requiresElectricity;

    public PassengerWagon(String wagonType, int maxNumberOfPassengers, int weight, int number, Locomotive assignedToLocomotive, boolean hasCargo, boolean requiresElectricity) {
        super(wagonType, weight, number, assignedToLocomotive, hasCargo);
        this.requiresElectricity = requiresElectricity;
        this.maxNumberOfPassengers = maxNumberOfPassengers;
    }

    public boolean isRequiresElectricity() {
        return requiresElectricity;
    }

    public int getMaxNumberOfPassengers() {
        return maxNumberOfPassengers;
    }

    public static void createPassengerWagons(ArrayList<Wagon> wagons) {
        wagons.add(new PassengerWagon("Passenger", 100, 4000,  1, null, false, true));
        wagons.add(new PassengerWagon("Passenger", 70,  3000,  2, null, false, true));
        wagons.add(new PassengerWagon("Passenger", 50,  2000,  3, null, false, true));
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(", Max number of passengers: " + getMaxNumberOfPassengers() + ", Requires electricity: " + isRequiresElectricity());
    }
}

