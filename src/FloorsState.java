import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// shows the state of the building
public final class FloorsState {
    //list of all floors in the building
    private final ArrayList<FloorState> Floors = new ArrayList<>();

    // default constructor
    private FloorsState() {}

    //getter for the floors
    public ArrayList<FloorState> GetFloors() {
        return Floors;
    }

    //constructor to initialise floors with requests from a file
    public FloorsState(int numFloors, HashMap<Integer, List<Integer>> requestsMap) {
        for (int i = 0; i < numFloors; i++) {
            List<Integer> requests = requestsMap.getOrDefault(i + 1, new ArrayList<>());
            Floors.add(new FloorState(requests));
        }
    }

    // easily convert to string for debugging
    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder("Floors = {");
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
