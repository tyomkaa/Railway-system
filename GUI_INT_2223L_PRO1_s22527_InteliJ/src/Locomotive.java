import java.util.ArrayList;

public class Locomotive {

    private String model;
    private int maxSpeed;
    private int weight;
    private ArrayList<Wagon> wagons;
    private Wagon wagon;
    private int maxWagonCount;
    private int maxLoad;
    private int maxElectricWagonCount;

    public Locomotive(String model, int maxSpeed, int weight, int maxWagonCount, int maxLoad, int maxElectricWagonCount) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.maxWagonCount = maxWagonCount;
        this.maxLoad = maxLoad;
        this.maxElectricWagonCount = maxElectricWagonCount;
        this.wagons = new ArrayList<Wagon>();
    }

    public String getModel() {
        return model;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void printInfo() {
        System.out.println("Model: " + getModel());
        System.out.println("Max speed: " + maxSpeed + " km/h");
        System.out.println("Weight: " + weight + " tons");
    }

    public void addWagon(Wagon wagon) {
        wagons.add(wagon);
    }

    public static void createLocomotives(ArrayList<Locomotive> locomotives) {
        locomotives.add(new Locomotive("LocomotiveA", 200, 80, 5, 10000, 2));
        locomotives.add(new Locomotive("LocomotiveB", 250, 85, 4, 9000, 1));
        locomotives.add(new Locomotive("LocomotiveC", 300, 90, 3, 8000, 1));
    }


    public int getMaxWagonCount() {
        return maxWagonCount;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public ArrayList<Wagon> getWagons() {
        return wagons;  
    }

    public int getMaxElectricWagonCount() {
        return maxElectricWagonCount;
    }

    public void changeSpeed() {
        double changePercent = Math.random() * 0.06 - 0.03;
        int newSpeed = (int) (maxSpeed * (1 + changePercent));
        if (newSpeed <= 0) {
            newSpeed = 1;
        } else if (newSpeed > maxSpeed) {
            newSpeed = maxSpeed;
        }
        setMaxSpeed(newSpeed);
    }

    public int getTotalWagonWeight() {
        int totalWeight = 0;
        for (Wagon wagon : wagons) {
            totalWeight = totalWeight + wagon.getWeight() + wagon.getCargoWeight();
        }
        return totalWeight;
    }


}
