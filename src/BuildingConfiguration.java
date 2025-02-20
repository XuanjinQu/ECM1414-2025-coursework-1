
import java.util.ArrayList;
import java.util.Random;

// Represents a floor on the building
final class Floor {
    //  each object represents a number of people
    // the value of each object represents the floor number that person wants to travel to
    java.util.ArrayList<Integer> FloorRequests = new ArrayList<Integer>();

    // default constructor
    // marked private to control how this class is initialised
    private Floor() {}

    // Getter for floor requests
    public java.util.ArrayList<Integer> GetFloorRequests() {
        return FloorRequests;
    }

    // private setter for floor requests
    // avoids external entities modifying this class mid-algorithm by accident
    private void AddFloorRequest(int floor) {
        FloorRequests.add(floor);
    }

    // helper function to generate a random instance of a Floor
    public static Floor FromRandom(int MaxDestination, int MaxNumberOfRequests) {
        Random rand = new Random();

        Floor floor = new Floor();

        int NumberofRequests = rand.nextInt(MaxNumberOfRequests);

        for (int i = 0; i < NumberofRequests; i++) {
            floor.AddFloorRequest(rand.nextInt(MaxDestination));
        }

        return floor;
    }

    // helpful when debugging allows simple printing of the object
    public String toString() {
        StringBuilder ret = new StringBuilder("floor = {");
        for (int i = 0; i < FloorRequests.size(); i++) {
            ret.append(FloorRequests.get(i));
            if (i != FloorRequests.size() - 1) {
                ret.append(", ");
            }
        }
        ret.append("}");
        return ret.toString();
    }
}

// Represents the state of the building
final class BuildingConfiguration {
    // contains any number of floors
    java.util.ArrayList<Floor> Floors  = new java.util.ArrayList<Floor>();

    // private default constructor
    // allows us to better control how this class is initialized, through static member functions e.g GetRandom
    private BuildingConfiguration() {}

    // Getter for the floors
    public java.util.ArrayList<Floor> GetFloors() {
        return Floors;
    }

    // private setter for the floors
    // prevents modification of the floors by external entities
    private void AddFloor(Floor floor) {
        Floors.add(floor);
    }

    // helper function to get a random instance of a Building configuration
    public static BuildingConfiguration FromRandom(int MaxFloors, int MaxPeoplePerFloor) {
        Random rand = new Random();

        BuildingConfiguration Configuration = new BuildingConfiguration();

        int AmountOfFloors = rand.nextInt(MaxFloors);

        for (int i = 0; i < AmountOfFloors; i++) {
            Floor floor = Floor.FromRandom(MaxFloors, MaxPeoplePerFloor);

            Configuration.AddFloor(floor);
        }

        return Configuration;
    }

    // easily convert to string for simple printing
    public String toString() {
        StringBuilder ret = new StringBuilder("Building[floors = {");
        for (int i = 0; i < Floors.size(); i++) {
            ret.append(Floors.get(i).toString());
            if (i != Floors.size() - 1) {
                ret.append(", ");
            }
        }
        ret.append("}]");
        return ret.toString();
    }
}