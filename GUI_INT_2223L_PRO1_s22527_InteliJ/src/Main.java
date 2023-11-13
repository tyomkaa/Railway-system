import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        TrainComposition trainComposition = new TrainComposition();
        ArrayList<Locomotive> locomotives = new ArrayList<>();
        ArrayList<Wagon> wagons = new ArrayList<>();
        ArrayList<Station> stations = new ArrayList<>();



        do {
            System.out.println("Menu:");
            System.out.println("1. Create a locomotive");
            System.out.println("2. Create a wagon");
            System.out.println("3. Create a station");
            System.out.println("4. Create a connection between stations");
            System.out.println("5. Assign the wagon to a locomotive");
            System.out.println("6. Load cargo into the wagon");
            System.out.println("7. Remove the locomotive");
            System.out.println("8. Remove the wagon");
            System.out.println("9. Delete a station");
            System.out.println("10. Clear the train composition");
            System.out.println("11. To see the info about locomotives");
            System.out.println("12. To see the info about wagons");
            System.out.println("13. To see the list of stations");
            System.out.println("14. To see the current station");
            System.out.println("15. To see the next station");
            System.out.println("16. Information of the train's composition");
            System.out.println("0. Exit");

            System.out.print("Enter the menu item number: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("1. Creating a locomotive with a list of models");
                    System.out.println("2. Creating one locomotive");
                    System.out.print("Select an action: ");
                    int locomotiveChoice = scanner.nextInt();
                    if (locomotiveChoice == 1) {
                        Locomotive.createLocomotives(locomotives);
                        trainComposition.getLocomotives().addAll(locomotives);
                        System.out.println("Locomotives have been successfully created.");
                    } else if (locomotiveChoice == 2) {
                        System.out.print("Enter locomotive model: ");
                        String model = scanner.next();
                        System.out.print("Enter the speed of the locomotive: ");
                        int speed = scanner.nextInt();
                        System.out.print("Enter the weight of the locomotive: ");
                        int weight = scanner.nextInt();
                        System.out.print("Enter the maximum number of locomotive wagons: ");
                        int maxWagonCount = scanner.nextInt();
                        System.out.print("Enter the maximum load of the locomotive: ");
                        int maxLoad = scanner.nextInt();
                        System.out.print("Enter the maximum number of electric locomotive wagons: ");
                        int maxElectricWagonCount = scanner.nextInt();
                        Locomotive locomotive = new Locomotive(model, speed, weight, maxWagonCount, maxLoad, maxElectricWagonCount);
                        trainComposition.getLocomotives().add(locomotive);
                        System.out.println("Locomotives have been successfully created.");
                    } else {
                        System.out.println("Wrong choice.");

                    }
                    break;
                case 2:
                    System.out.println("1. Creating a wagon with a list of models");
                    System.out.println("2. Creating a single wagon");
                    System.out.print("Select an action: ");
                    int wagonChoice = scanner.nextInt();
                    if (wagonChoice == 1) {
                        scanner.nextLine();
                        System.out.println("What kind of wagon do you want to create?");
                        System.out.println("1. Passenger");
                        System.out.println("2. Post");
                        System.out.println("3. Restaurant");
                        System.out.println("4. Basic freight");
                        System.out.println("5. Heavy freight");
                        System.out.println("6. Refrigerated wagon");
                        System.out.println("7. Liquid wagon");
                        System.out.println("8. Gaz wagon");
                        System.out.println("9. Explosive wagon");
                        System.out.println("10. Toxic wagon");
                        System.out.println("11. Toxic liquid wagon");
                        int type = scanner.nextInt();
                        if (type == 1) {
                            ArrayList<Wagon> newWagons = new ArrayList<>();
                            PassengerWagon.createPassengerWagons(newWagons);
                            for (Wagon wagon : newWagons) {
                                if (!trainComposition.getWagons().contains(wagon)) {
                                    trainComposition.getWagons().add(wagon);
                                }
                            }
                        } else if (type == 2){
                            ArrayList<Wagon> newWagons = new ArrayList<>();
                            PostWagon.createPostWagons(newWagons);
                            for (Wagon wagon : newWagons) {
                                if (!trainComposition.getWagons().contains(wagon)) {
                                    trainComposition.getWagons().add(wagon);
                                }
                            }
                        }else if (type == 3){
                            ArrayList<Wagon> newWagons = new ArrayList<>();
                            RestaurantWagon.createRestaurantWagons(newWagons);
                            for (Wagon wagon : newWagons) {
                                if (!trainComposition.getWagons().contains(wagon)) {
                                    trainComposition.getWagons().add(wagon);
                                }
                            }
                        }else if (type == 4){
                            ArrayList<Wagon> newWagons = new ArrayList<>();
                            BasicFreightWagon.createBasicFreightWagons(newWagons);
                            for (Wagon wagon : newWagons) {
                                if (!trainComposition.getWagons().contains(wagon)) {
                                    trainComposition.getWagons().add(wagon);
                                }
                            }
                        }
                        else if (type == 5){
                            ArrayList<Wagon> newWagons = new ArrayList<>();
                            HeavyFreightWagon.createHeavyFreightWagons(newWagons);
                            for (Wagon wagon : newWagons) {
                                if (!trainComposition.getWagons().contains(wagon)) {
                                    trainComposition.getWagons().add(wagon);
                                }
                            }
                        }else if (type == 6){
                            ArrayList<Wagon> newWagons = new ArrayList<>();
                            RefrigeratedWagon.createRefrigeratedWagons(newWagons);
                            for (Wagon wagon : newWagons) {
                                if (!trainComposition.getWagons().contains(wagon)) {
                                    trainComposition.getWagons().add(wagon);
                                }
                            }
                        }else if (type == 7){
                            ArrayList<Wagon> newWagons = new ArrayList<>();
                            LiquidWagon.createLiquidWagons(newWagons);
                            for (Wagon wagon : newWagons) {
                                if (!trainComposition.getWagons().contains(wagon)) {
                                    trainComposition.getWagons().add(wagon);
                                }
                            }
                        }else if (type == 8){
                            ArrayList<Wagon> newWagons = new ArrayList<>();
                            GazWagon.createGazWagons(newWagons);
                            for (Wagon wagon : newWagons) {
                                if (!trainComposition.getWagons().contains(wagon)) {
                                    trainComposition.getWagons().add(wagon);
                                }
                            }
                        }else if (type == 9){
                            ArrayList<Wagon> newWagons = new ArrayList<>();
                            ExplosiveWagon.createExplosiveWagons(newWagons);
                            for (Wagon wagon : newWagons) {
                                if (!trainComposition.getWagons().contains(wagon)) {
                                    trainComposition.getWagons().add(wagon);
                                }
                            }
                        }else if (type == 10){
                            ArrayList<Wagon> newWagons = new ArrayList<>();
                            ToxicWagon.createToxicWagons(newWagons);
                            for (Wagon wagon : newWagons) {
                                if (!trainComposition.getWagons().contains(wagon)) {
                                    trainComposition.getWagons().add(wagon);
                                }
                            }
                        }else if (type == 11){
                            ArrayList<Wagon> newWagons = new ArrayList<>();
                            ToxicLiquidWagon.createToxicLiquidWagons(newWagons);
                            for (Wagon wagon : newWagons) {
                                if (!trainComposition.getWagons().contains(wagon)) {
                                    trainComposition.getWagons().add(wagon);
                                }
                            }
                        }
                    }else if (wagonChoice == 2) {
                        System.out.println("Select wagon type: Passenger, Post, Restaurant, Basic freight, Heavy freight, Refrigerated, Liquid, Gaz, Explosive, Toxic, Liquid toxic");
                        scanner.nextLine();
                        String wagonType = scanner.nextLine();
                        if (wagonType.equalsIgnoreCase("Passenger")) {
                            System.out.println("Enter the maximum number of passengers");
                            int maxPassengers = scanner.nextInt();
                            System.out.println("Enter the weight of the wagon");
                            int weight = scanner.nextInt();
                            System.out.println("Enter the wagon number");
                            int number = scanner.nextInt();
                            PassengerWagon passengerWagon = new PassengerWagon(wagonType, maxPassengers, weight, number, null, false, true);
                            trainComposition.getWagons().add(passengerWagon);
                            System.out.println("Wagon successfully created.");
                        }else if (wagonType.equalsIgnoreCase("Post")){
                            System.out.println("Input the maximum mailboxes");
                            int maxMailboxes = scanner.nextInt();
                            System.out.println("Enter the weight of the wagon");
                            int weight = scanner.nextInt();
                            System.out.println("Enter the wagon number");
                            int number = scanner.nextInt();
                            PostWagon postWagon = new PostWagon(wagonType, weight, number, null, false, maxMailboxes, true);
                            trainComposition.getWagons().add(postWagon);
                            System.out.println("Wagon successfully created.");
                        }else if (wagonType.equalsIgnoreCase("Restaurant")){
                            System.out.println("Does it have a bar?");
                            boolean hasBar = scanner.nextBoolean();
                            System.out.println("Enter the weight of the wagon");
                            int weight = scanner.nextInt();
                            System.out.println("Enter the wagon number");
                            int number = scanner.nextInt();
                            RestaurantWagon restaurantWagon = new RestaurantWagon(wagonType, weight, number, null, false, true, true);
                            trainComposition.getWagons().add(restaurantWagon);
                            System.out.println("Wagon successfully created.");
                        }else if (wagonType.equalsIgnoreCase("Basic freight")){
                            System.out.println("Input the loader");
                            String loader = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("Does it have a ventilation?");
                            boolean hasVentilation = scanner.nextBoolean();
                            System.out.println("Enter the weight of the wagon");
                            int weight = scanner.nextInt();
                            System.out.println("Enter the wagon number");
                            int number = scanner.nextInt();
                            BasicFreightWagon basicFreightWagon = new BasicFreightWagon(wagonType, weight, number, null, true, loader, hasVentilation);
                            trainComposition.getWagons().add(basicFreightWagon);
                            System.out.println("Wagon successfully created.");
                        }else if (wagonType.equalsIgnoreCase("Heavy freight")){
                            System.out.println("Input the type of braking system");
                            String typeOfBrakingSystem = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("Input the type of suspension?");
                            String typeOfSuspension = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("Enter the weight of the wagon");
                            int weight = scanner.nextInt();
                            System.out.println("Enter the wagon number");
                            int number = scanner.nextInt();
                            HeavyFreightWagon heavyFreightWagon = new HeavyFreightWagon(wagonType, weight, number, null, true, typeOfBrakingSystem, typeOfSuspension);
                            trainComposition.getWagons().add(heavyFreightWagon);
                            System.out.println("Wagon successfully created.");
                        }else if (wagonType.equalsIgnoreCase("Refrigerated")){
                            System.out.println("Input the loader");
                            String loader = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("Does it have a ventilation?");
                            boolean hasVentilation = scanner.nextBoolean();
                            System.out.println("Input the max temperature");
                            float maxTemperature = scanner.nextFloat();
                            System.out.println("Does it have a temperature monitoring system?");
                            boolean hasTemperatureMonitoringSystem = scanner.nextBoolean();
                            System.out.println("Enter the weight of the wagon");
                            int weight = scanner.nextInt();
                            System.out.println("Enter the wagon number");
                            int number = scanner.nextInt();
                            RefrigeratedWagon refrigeratedWagon = new RefrigeratedWagon(wagonType, weight, number, null, true, loader, hasVentilation, maxTemperature, hasTemperatureMonitoringSystem, true);
                            trainComposition.getWagons().add(refrigeratedWagon);
                            System.out.println("Wagon successfully created.");
                        }else if (wagonType.equalsIgnoreCase("Liquid")){
                            System.out.println("Input the loader");
                            String loader = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("Does it have a ventilation?");
                            boolean hasVentilation = scanner.nextBoolean();
                            System.out.println("Input the tank capacity");
                            int tankCapacity = scanner.nextInt();
                            System.out.println("Enter the weight of the wagon");
                            int weight = scanner.nextInt();
                            System.out.println("Enter the wagon number");
                            int number = scanner.nextInt();
                            LiquidWagon liquidWagon = new LiquidWagon(wagonType, weight, number, null, true, loader, hasVentilation, tankCapacity);
                            trainComposition.getWagons().add(liquidWagon);
                            System.out.println("Wagon successfully created.");
                        }else if (wagonType.equalsIgnoreCase("Gaz")){
                            System.out.println("Input the loader");
                            String loader = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("Does it have a ventilation?");
                            boolean hasVentilation = scanner.nextBoolean();
                            System.out.println("Input the max gaz tanks");
                            int maxGazTanks = scanner.nextInt();
                            System.out.println("Enter the weight of the wagon");
                            int weight = scanner.nextInt();
                            System.out.println("Enter the wagon number");
                            int number = scanner.nextInt();
                            GazWagon gazWagon = new GazWagon(wagonType, weight, number, null, true, loader, hasVentilation, maxGazTanks);
                            trainComposition.getWagons().add(gazWagon);
                            System.out.println("Wagon successfully created.");
                        }else if (wagonType.equalsIgnoreCase("Explosive")){
                            System.out.println("Input the type of braking system");
                            String typeOfBrakingSystem = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("Input the type of suspension?");
                            String typeOfSuspension = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("Input the maximum explosive containers");
                            int maxExplosiveContainers = scanner.nextInt();
                            System.out.println("Enter the weight of the wagon");
                            int weight = scanner.nextInt();
                            System.out.println("Enter the wagon number");
                            int number = scanner.nextInt();
                            ExplosiveWagon explosiveWagon = new ExplosiveWagon(wagonType, weight, number, null, true, typeOfBrakingSystem, typeOfSuspension, maxExplosiveContainers);
                            trainComposition.getWagons().add(explosiveWagon);
                            System.out.println("Wagon successfully created.");
                        }else if (wagonType.equalsIgnoreCase("Toxic")){
                            System.out.println("Input the type of braking system");
                            String typeOfBrakingSystem = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("Input the type of suspension?");
                            String typeOfSuspension = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("Input the toxicitu level (MAX, MEDIUM or LOW)");
                            String toxicityLevel = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("Enter the weight of the wagon");
                            int weight = scanner.nextInt();
                            System.out.println("Enter the wagon number");
                            int number = scanner.nextInt();
                            ToxicWagon toxicWagon = new ToxicWagon(wagonType, weight, number, null, true, typeOfBrakingSystem, typeOfSuspension, toxicityLevel);
                            trainComposition.getWagons().add(toxicWagon);
                            System.out.println("Wagon successfully created.");
                        }else if (wagonType.equalsIgnoreCase("Liquid toxic")){
                            System.out.println("Input the loader");
                            String loader = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("Does it have a ventilation?");
                            boolean hasVentilation = scanner.nextBoolean();
                            System.out.println("Input the tank capacity");
                            int tankCapacity = scanner.nextInt();
                            System.out.println("Input the type of liquid");
                            String typeOfLiquid = scanner.nextLine();
                            scanner.nextLine();
                            System.out.println("Enter the weight of the wagon");
                            int weight = scanner.nextInt();
                            System.out.println("Enter the wagon number");
                            int number = scanner.nextInt();
                            ToxicLiquidWagon toxicLiquidWagon = new ToxicLiquidWagon(wagonType, weight, number, null, true, loader, hasVentilation, tankCapacity, typeOfLiquid);
                            trainComposition.getWagons().add(toxicLiquidWagon);
                            System.out.println("Wagon successfully created.");
                        }
                    }
                        break;
                case 3:
                    System.out.print("Enter station name: ");
                    String stationName = scanner.next();
                    Station station = new Station(stationName);
                    trainComposition.addStation(station);
                    stations.add(station);
                    if (trainComposition == null) {
                        System.out.println("First, create a locomotive.");
                    } else {
                        trainComposition.setCurrentStation(station);
                        System.out.println("Station successfully set up and installed as current for train.");
                    }
                    break;
                case 4:
                    if (trainComposition == null) {
                        System.out.println("First, create a locomotive.");
                    } else if (trainComposition.getCurrentStation() == null) {
                        System.out.println("First create a station and set it as the current station for the train.");
                    } else {
                        System.out.print("Enter the name of the station to be connected: ");
                        String nextStationName = scanner.next();
                        Station nextStation = new Station(nextStationName);
                        trainComposition.setNextStation(nextStation);
                        System.out.println("Connection between stations successfully established.");
                    }
                    break;
                case 5:
                    if (trainComposition == null) {
                        System.out.println("First, create a locomotive.");
                    } else if (trainComposition.getWagons().isEmpty()) {
                        System.out.println("No wagons available for destination.");
                    } else {
                        System.out.print("Enter locomotive model to select: ");
                        scanner.nextLine();
                        String locomotiveModel = scanner.nextLine();
                        Locomotive selectedLocomotive = null;
                        for (Locomotive locomotive : trainComposition.getLocomotives()) {
                            if (locomotive.getModel().equalsIgnoreCase(locomotiveModel)) {
                                selectedLocomotive = locomotive;
                                break;
                            }
                        }
                        if (selectedLocomotive == null) {
                            System.out.println("No locomotive with this model found.");
                        } else {
                            System.out.print("Enter the wagon number for the destination: ");
                            int wagonNumber = scanner.nextInt();
                            Wagon wagon = null;
                            for (Wagon w : trainComposition.getWagons()) {
                                if (w.getNumber() == wagonNumber) {
                                    wagon = w;
                                    break;
                                }
                            }
                            if (wagon == null) {
                                System.out.println("No wagon with this number was found.");
                            } else if (selectedLocomotive.getMaxWagonCount() == selectedLocomotive.getWagons().size()) {
                                System.out.println("The locomotive cannot pull more wagons.");
                            } else if (wagon.getCurrentStation() != trainComposition.getCurrentStation()) {
                                System.out.println("The wagon is in another station.");
                            } else if (selectedLocomotive.getMaxLoad() < wagon.getWeight() + selectedLocomotive.getTotalWagonWeight()) {
                                System.out.println("Locomotive can not hold more weight");
                            } else {
                                selectedLocomotive.addWagon(wagon);
                                wagon.setLocomotive(selectedLocomotive);
                                System.out.println("The car has been successfully assigned to a locomotive.");
                            }
                        }
                    }
                    break;
                case 6:
                    if (trainComposition == null) {
                        System.out.println("First, create a locomotive.");
                    } else if (trainComposition.getWagons().isEmpty()) {
                        System.out.println("No wagons available for loading.");
                    } else {
                        System.out.print("Enter the wagon number to be loaded: ");
                        int wagonNumber = scanner.nextInt();
                        Wagon wagon = null;
                        for (Wagon w : trainComposition.getWagons()) {
                            if (w.getNumber() == wagonNumber) {
                                wagon = w;
                                break;
                            }
                        }
                        if (wagon == null) {
                            System.out.println("No wagon with this number was found.");
                        } else if (!wagon.hasCargo()) {
                            System.out.println("The wagon is not a freight wagon, the load cannot be loaded.");
                        } else {
                            System.out.print("Enter the weight of the load (tonnes): ");
                            int cargoWeight = scanner.nextInt();
                            if (wagon.getCargoWeight() + cargoWeight > wagon.getWeight()) {
                                System.out.println("The load cannot be loaded because the capacity limit of the wagon has been exceeded.");
                            } else {
                                wagon.loadCargo(cargoWeight);
                                System.out.println("Cargo successfully loaded onto the wagon.");
                            }
                        }
                    }
                    break;
                case 7:
                    if (trainComposition == null) {
                        System.out.println("First, create a locomotive.");
                    } else {
                        System.out.println("Enter the model name of the locomotive to be removed:");
                        String model = scanner.next();
                        trainComposition.removeLocomotive(model);
                    }
                    break;
                case 8:
                    if (trainComposition == null) {
                        System.out.println("First, create a wagon.");
                    } else {
                        System.out.println("Enter the number of the wagon to be deleted:");
                        int number = scanner.nextInt();
                        trainComposition.removeWagon(number);
                    }
                    break;
                case 9:
                    if (trainComposition.getStations().isEmpty()) {
                        System.out.println("No stations available for removal.");
                    } else {
                        System.out.println("Enter the station to be deleted:");
                        scanner.nextLine();
                        String stat = scanner.nextLine();
                        for (int i = 0; i < trainComposition.getStations().size(); i++) {
                            if (trainComposition.getStations().get(i).getName().equals(stat)) {
                                trainComposition.getStations().remove(i);
                                System.out.println("Station " + stat + " has been successfully removed from the line-up.");
                                break;
                            }
                        }
                    }
                    break;
                case 10:
                    if (trainComposition == null) {
                        System.out.println("First, create a locomotive.");
                    } else {
                        trainComposition.clear();
                        System.out.println("The composition has been successfully cleared.");
                    }
                    break;
                case 11:
                    List<Locomotive> trainLocomotives = trainComposition.getLocomotives();
                    if (trainLocomotives.isEmpty()) {
                        System.out.println("The list of locomotives is empty.");
                    } else {
                        for (Locomotive locomotive : trainLocomotives) {
                            locomotive.printInfo();
                        }
                    }
                    break;
                case 12:
                    List<Wagon> trainWagons = trainComposition.getWagons();
                    if (trainWagons.isEmpty()){
                        System.out.println("The list of wagons is empty.");
                    } else {
                        for (Wagon wagon : trainWagons) {
                            wagon.printInfo();
                        }
                    }
                    break;
                case 13:
                    if (trainComposition == null){
                        System.out.println("First, create a station.");
                    } else {
                        trainComposition.printStations();
                    }
                    break;
                case 14:
                    if (trainComposition == null){
                        System.out.println("First, create a station.");
                    } else {
                        System.out.println("Current station: " + trainComposition.getCurrentStation().getName());
                    }
                    break;
                case 15:
                    if (trainComposition == null){
                        System.out.println("First, create a station.");
                    }else {
                        System.out.println("Next station: " + trainComposition.getNextStation().getName());
                    }
                    break;
                case 16:
                    if (trainComposition == null || trainComposition.getLocomotives().isEmpty()) {
                        System.out.println("The train is not formed.");
                    } else {
                        System.out.println("Information of the train's composition:");
                        for (Locomotive locomotive : trainComposition.getLocomotives()) {
                            System.out.println(" Locomotive: " + locomotive.getModel() + ":");
                            System.out.println(" Maximum number of wagons: " + locomotive.getMaxWagonCount());
                            System.out.println(" Current number of wagons: " + locomotive.getWagons().size());
                            System.out.println(" Total weight of the wagons: " + locomotive.getTotalWagonWeight() + " tons");
                            System.out.println(" Wagons:");
                            for (Wagon wagon : locomotive.getWagons()) {
                                System.out.println(" Wagon " + wagon.getWagonType() + ":");
                                System.out.println(" Wagon number " + wagon.getNumber() + ":");
                                System.out.println(" Load weight: " + wagon.getCargoWeight() + " tons");
                                System.out.println(" Total weight: " + wagon.getWeight() + " tons");
                            }
                        }
                    }
                    break;
                case 0:
                    // выход из программы
                    break;
                default:
                    System.out.println("Incorrect choice. Try again.");
            }
        } while (choice != 0);
    }
}

class Neuron():
        def init(self, input, acti, eta):
        self.W=np.random.randn(input)
        self.Wb=np.random.randn(1)
        self.acti=acti
        self.eta=eta

        def predict(self, x):
        # Добавляем bias (смещение)
        x = np.append(x, [1])
        # Вычисляем сумму взвешенных входов
        z = np.dot(x, self.W) + self.Wb
        # Применяем функцию активации к полученному значению
        self.last_output = self.acti.acti(z)
        return self.last_output

        def fit(self, delta):
        # Вычисляем градиент для каждого веса и bias (смещения)
        dW = np.outer(self.last_input, delta)
        dWb = delta
        # Обновляем веса и bias (смещения)
        self.W -= self.eta * dW
        self.Wb -= self.eta * dWb
