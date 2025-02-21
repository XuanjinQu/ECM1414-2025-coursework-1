
import java.util.ArrayList;
import java.util.Random;

// Represents the state of the building
final public class FloorsState {
    // contains any number of floors
    java.util.ArrayList<FloorState> Floors  = new java.util.ArrayList<FloorState>();

    // private default constructor
    // allows us to better control how this class is initialized, through static member functions e.g GetRandom
    private FloorsState() {}

    // Getter for the floors
    public java.util.ArrayList<FloorState> GetFloors() {
        return Floors;
    }

    // private setter for the floors
    // prevents modification of the floors by external entities
    private void AddFloor(FloorState floor) {
        Floors.add(floor);
    }

    // helper function to get a random instance of a Building configuration
    public static FloorsState FromRandom(int MaxFloors, int MaxPeoplePerFloor) {
        Random rand = new Random();

        FloorsState Configuration = new FloorsState();

        int AmountOfFloors = rand.nextInt(MaxFloors);

        for (int i = 0; i < AmountOfFloors; i++) {
            FloorState floor = FloorState.FromRandom(MaxFloors, MaxPeoplePerFloor);

            Configuration.AddFloor(floor);
        }

        return Configuration;
    }

    // easily convert to string for simple printing
    public String toString() {
        StringBuilder ret = new StringBuilder("floors = {");
        for (int i = 0; i < Floors.size(); i++) {
            ret.append(Floors.get(i).toString());
            if (i != Floors.size() - 1) {
                ret.append(", ");
            }
        }
        ret.append("}");
        return ret.toString();
    }
}