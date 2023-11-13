import java.util.ArrayList;

public class RestaurantWagon extends Wagon implements Wagons {

    private boolean hasBar;
    private boolean requiresElectricity;

    public RestaurantWagon(String wagonType, int weight, int number, Locomotive assignedToLocomotive, boolean hasCargo, boolean hasBar, boolean requiresElectricity) {
        super(wagonType, weight, number, assignedToLocomotive, hasCargo);
        this.hasBar = hasBar;
        this.requiresElectricity = requiresElectricity;
    }

    public boolean isHasBar() {
        return hasBar;
    }

    public boolean isRequiresElectricity() {
        return requiresElectricity;
    }

    public static void createRestaurantWagons(ArrayList<Wagon> wagons) {
        wagons.add(new RestaurantWagon("Restaurant", 4000, 1,  null, false, true, true));
        wagons.add(new RestaurantWagon("Restaurant", 3000,  2,  null, false, false, true));
        wagons.add(new RestaurantWagon("Restaurant", 2000,  3,  null, false, true, true));
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(", Is there a bar: " + isHasBar() + ", Requires electricity: " + isRequiresElectricity());
    }
}
