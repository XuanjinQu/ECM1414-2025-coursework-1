import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

// Represents a floor on the building
public final class FloorState {
    //  each object represents a number of people
    // the value of each object represents the floor number that person wants to travel to
    java.util.Queue<Integer> FloorRequests = new java.util.LinkedList<Integer>();

    // default constructor
    // marked private to control how this class is initialised
    private FloorState() {}

    // Getter for floor requests
    public java.util.Queue<Integer> GetFloorRequests() {
        return FloorRequests;
    }

    // private setter for floor requests
    // avoids external entities modifying this class mid-algorithm by accident
    private void AddFloorRequest(int floor) {
        FloorRequests.add(floor);
    }

    // helper function to generate a random instance of a Floor
    public static FloorState FromRandom(int MaxDestination, int MaxNumberOfRequests) {
        Random rand = new Random();

        FloorState floor = new FloorState();

        int NumberofRequests = rand.nextInt(MaxNumberOfRequests);

        for (int i = 0; i < NumberofRequests; i++) {
            floor.AddFloorRequest(rand.nextInt(MaxDestination));
        }

        return floor;
    }

    // helpful when debugging allows simple printing of the object
    public String toString() {
        StringBuilder ret = new StringBuilder("floor = {");
        Queue<Integer> FloorRequestsCopy = new LinkedList<>(FloorRequests);
        for (int i = 0; i < FloorRequests.size(); i++) {
            ret.append(FloorRequestsCopy.remove());
            if (i != FloorRequests.size() - 1) {
                ret.append(", ");
            }
        }
        ret.append("}");
        return ret.toString();
    }
}
