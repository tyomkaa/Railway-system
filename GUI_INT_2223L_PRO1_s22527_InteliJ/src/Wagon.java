import java.util.ArrayList;

public class Wagon implements Wagons{
    private String wagonType;
    private int wagonNumber;
    private boolean hasCargo;
    private Locomotive locomotive;
    private int weight;
    private int cargoWeight;
    private int number;
    private Station currentStation;
    private Locomotive assignedToLocomotive;

    public Wagon(String wagonType, int weight, int number, Locomotive assignedToLocomotive, boolean hasCargo) {
        this.wagonType = wagonType;
        this.wagonNumber = wagonNumber;
        this.hasCargo = hasCargo;
        this.weight = weight;
        this.cargoWeight = cargoWeight;
        this.number = number;
        this.assignedToLocomotive = assignedToLocomotive;
    }

    public Locomotive getAssignedToLocomotive() {
        return assignedToLocomotive;
    }

    public void setAssignedToLocomotive(Locomotive assignedToLocomotive) {
        this.assignedToLocomotive = assignedToLocomotive;
    }

    @Override
    public String getWagonType() {
        return wagonType;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public boolean hasCargo() {
        return hasCargo;
    }

    public void setHasCargo(boolean hasCargo) {
        this.hasCargo = hasCargo;
    }

    public Locomotive getLocomotive() {
        return locomotive;
    }

    @Override
    public void setLocomotive(Locomotive locomotive) {
        this.locomotive = locomotive;
    }

    @Override
    public void loadCargo(int weight) {
        cargoWeight += weight;
    }

    @Override
    public int getCargoWeight() {
        return cargoWeight;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public Station getCurrentStation() {
        return null;
    }

    public void printInfo() {
        if (locomotive != null) {
            System.out.print("Type: " + getWagonType() + ", Weight: " + getWeight() + ", Number: " + getNumber() + ", Assigned to locomotive: " + getLocomotive().getModel());
        } else {
            System.out.print("Type: " + getWagonType() + ", Weight: " + getWeight() + ", Number: " + getNumber() + ", Assigned to locomotive: None");
        }

    }

}
