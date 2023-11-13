public interface Wagons {
    Station getCurrentStation();
    int getWeight();
    boolean hasCargo();
    void loadCargo(int weight);
    void setLocomotive(Locomotive locomotive);
    int getCargoWeight();
    int getNumber();
    String getWagonType();
}
