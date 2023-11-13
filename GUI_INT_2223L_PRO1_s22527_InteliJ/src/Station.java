import java.util.ArrayList;
import java.util.List;

public class Station {
    private String name;
    private List<TrainComposition> arrivingTrains;
    private List<TrainComposition> departingTrains;

    public Station(String name) {
        this.name = name;
        this.arrivingTrains = new ArrayList<>();
        this.departingTrains = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<TrainComposition> getArrivingTrains() {
        return arrivingTrains;
    }

    public List<TrainComposition> getDepartingTrains() {
        return departingTrains;
    }

    public void addArrivingTrain(TrainComposition train) {
        arrivingTrains.add(train);
    }

    public void addDepartingTrain(TrainComposition train) {
        departingTrains.add(train);
    }

    public void removeArrivingTrain(TrainComposition train) {
        arrivingTrains.remove(train);
    }

    public void removeDepartingTrain(TrainComposition train) {
        departingTrains.remove(train);
    }

    @Override
    public String toString() {
        return "Station{" +
                "name='" + name + '\'' +
                ", arrivingTrains=" + arrivingTrains +
                ", departingTrains=" + departingTrains +
                '}';
    }
}

