
import java.util.ArrayList;
import java.util.Random;

final class Floor {
    //  each object represents a number of people
    // the value of each object represents the floor number that person wants to travel to
    java.util.ArrayList<Integer> FloorRequests = new ArrayList<Integer>();

    private Floor() {}

    public java.util.ArrayList<Integer> GetFloorRequests() {
        return FloorRequests;
    }

    private void AddFloorRequest(int floor) {
        FloorRequests.add(floor);
    }

    public static Floor FromRandom(int MaxDestination, int MaxNumberOfRequests) {
        Random rand = new Random();

        Floor floor = new Floor();

        int NumberofRequests = rand.nextInt(MaxNumberOfRequests);

        for (int i = 0; i < NumberofRequests; i++) {
            floor.AddFloorRequest(rand.nextInt(MaxDestination));
        }

        return floor;
    }

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

// Loads a Building configuration Object from a file path
final class BuildingConfiguration {
    // contains any number of floors
    java.util.ArrayList<Floor> Floors  = new java.util.ArrayList<Floor>();

    private BuildingConfiguration() {}

    public java.util.ArrayList<Floor> GetFloors() {
        return Floors;
    }

    private void AddFloor(Floor floor) {
        Floors.add(floor);
    }

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