import java.util.ArrayList;

public class RefrigeratedWagon extends BasicFreightWagon implements Wagons {

    private float maxTemperature;
    private boolean hasTemperatureMonitoringSystem;
    private boolean requiresElectricity;

    public RefrigeratedWagon(String wagonType, int weight, int number, Locomotive assignedToLocomotive, boolean hasCargo, String loader, boolean hasVentilation, float maxTemperature, boolean hasTemperatureMonitoringSystem, boolean requiresElectricity) {
        super(wagonType, weight, number, assignedToLocomotive, hasCargo, loader, hasVentilation);
        this.maxTemperature = maxTemperature;
        this.hasTemperatureMonitoringSystem = hasTemperatureMonitoringSystem;
        this.requiresElectricity = requiresElectricity;
    }

    public float getMaxTemperature() {
        return maxTemperature;
    }

    public boolean isHasTemperatureMonitoringSystem() {
        return hasTemperatureMonitoringSystem;
    }

    public static void createRefrigeratedWagons(ArrayList<Wagon> wagons) {
        wagons.add(new RefrigeratedWagon("Refrigerated wagon", 4000, 1,  null, true, "Roof hatches", true, 30, true, true));
        wagons.add(new RefrigeratedWagon("Refrigerated wagon", 3000,  2,  null,true,"Doors on the sides of the wagon", false, 20, false, true));
        wagons.add(new RefrigeratedWagon("Refrigerated wagon", 2000,  3,  null, true, "Conveyor", true, 10, true, true));
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(", Loader: " + getLoader() + ", Has ventilation: " + isHasVentilation() + ", Max temperature: " + getMaxTemperature() + ", Has temperature monitoring system: " + isHasTemperatureMonitoringSystem());
    }
}
