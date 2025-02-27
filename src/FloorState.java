import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
import java.util.Random;

//represents a floor on the building
public final class FloorState {
    //each object represents a number of people
    //the value of each object represents the floor number that person wants to travel to
    private final Queue<Integer> FloorRequests = new LinkedList<>();

    //default constructor - marked private to control how this class is initialized
    private FloorState() {}

    //constructor to initialise floor requests from a list from a file
    public FloorState(List<Integer> requests) {
        FloorRequests.addAll(requests);
    }

    //getter for floor requests
    public Queue<Integer> GetFloorRequests() {
        return FloorRequests;
    }

    // adds a floor request
    public void AddFloorRequest(int floor) {
        FloorRequests.add(floor);
    }

    //helper function to generate a floor with random requests 
    public static FloorState FromRandom(int MaxDestination, int MaxNumberOfRequests) {
        Random rand = new Random();
        FloorState floor = new FloorState();
        int NumberOfRequests = rand.nextInt(MaxNumberOfRequests);

        for (int i = 0; i < NumberOfRequests; i++) {
            int requestFloor;
            do {
                requestFloor = rand.nextInt(MaxDestination) + 1; // Ensure it's a valid floor
            } while (requestFloor == i + 1); // Prevent requesting the same floor
            floor.AddFloorRequest(requestFloor);
        }

        return floor;
    }

    //helpful when debugging allows simple printing of the object
    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder("Floor Requests: {");
        Queue<Integer> FloorRequestsCopy = new LinkedList<>(FloorRequests);
        int size = FloorRequestsCopy.size();

        for (int i = 0; i < size; i++) {
            ret.append(FloorRequestsCopy.remove());
            if (i != size - 1) {
                ret.append(", ");
            }
        }
        ret.append("}");
        return ret.toString();
    }
}
