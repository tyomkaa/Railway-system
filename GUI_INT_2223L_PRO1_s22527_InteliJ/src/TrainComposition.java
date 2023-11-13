import java.util.ArrayList;

public class TrainComposition {
    private Locomotive locomotive;
    private ArrayList<Wagon> wagons;
    private ArrayList<Station> stations;
    private ArrayList<Locomotive> locomotives;
    private Station currentStation;
    private Station nextStation;

    public TrainComposition(Locomotive locomotive) {
        this.locomotive = locomotive;
        this.wagons = new ArrayList<>();
        this.stations = new ArrayList<>();
        this.locomotives = new ArrayList<>();
        this.currentStation = null;
        this.nextStation = null;
    }

    public TrainComposition() {
        this.wagons = new ArrayList<>();
        this.stations = new ArrayList<>();
        this.locomotives = new ArrayList<>();
        this.currentStation = null;
        this.nextStation = null;
    }


    public void removeLocomotive(String model) {
        for (int i = 0; i < locomotives.size(); i++) {
            if (locomotives.get(i).getModel().equals(model)) {
                locomotives.remove(i);
                System.out.println("Locomotive " + model + " successfully removed from the line-up.");
                break;
            }
        }
    }

    public void removeWagon(int index) {
        for (int i = 0; i < wagons.size(); i++) {
            if (wagons.get(i).getNumber() == index) {
                wagons.remove(i);
                System.out.println("Wagon successfully removed from the train.");
                break;
            }
        }



    }

    public void setCurrentStation(Station station) {
        this.currentStation = station;
    }

    public Station getCurrentStation() {
        return currentStation;
    }

    public void setNextStation(Station station) {
        this.nextStation =station;
    }

    public Station getNextStation() {
        return nextStation;
    }

    public void addStation(Station station) {
        stations.add(station);
    }

    public boolean canDepart() {
        return currentStation != null && nextStation != null;
    }

    public void depart() {
        if (canDepart()) {
            System.out.println("The train departs from " + currentStation.getName() + " to " + nextStation.getName());
            currentStation = nextStation;
            nextStation = null;
        } else {
            System.out.println("Unable to send train. Current or next station not selected.");
        }
    }


    public void printStations() {
        System.out.println("Stations:");
        for (Station station : stations) {
            System.out.println("- " + station.getName());
        }
    }

    public ArrayList<Wagon> getWagons() {
        return wagons;
    }

    public ArrayList<Locomotive> getLocomotives() {
        return locomotives;
    }

    public Locomotive getLocomotive() {
        if (!locomotives.isEmpty()) {
            return locomotives.get(0);
        } else {
            System.out.println("The locomotive was not added.");
            return null;
        }
    }


    public ArrayList<Station> getStations() {
        return stations;
    }


    public void clear() {
        getWagons().clear();
        getLocomotives().clear();
    }





}
