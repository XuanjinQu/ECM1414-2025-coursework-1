import java.io.*;
import java.util.*;

public final class Building {
    private FloorsState floors;
    private LiftState lift;

    private Building() {}

    //Getter methods to access lift and floors
    public LiftState getLift() {
        return lift;
    }

    public FloorsState getFloors() {
        return floors;
    }

    // Load Building from a Text File
    public static Building FromFile(String filename) throws IOException {
        Building building = new Building();
        BufferedReader reader = new BufferedReader(new FileReader(filename));

        String line;
        int numFloors = 0;
        int capacity = 0;
        HashMap<Integer, List<Integer>> requestsMap = new HashMap<>();

        while ((line = reader.readLine()) != null) {
            line = line.trim();
            if (line.isEmpty() || line.startsWith("#")) continue; // skips comments and empty lines

            String[] parts = line.split(":");
            if (parts.length == 1 && parts[0].contains(",")) { 
                //parses number of floors and lift capacity
                String[] values = parts[0].split(",");
                numFloors = Integer.parseInt(values[0].trim());
                capacity = Integer.parseInt(values[1].trim());
            } else if (parts.length == 2) {
                // parses floor requests
                int floor = Integer.parseInt(parts[0].trim());
                String[] destinations = parts[1].split(",");
                List<Integer> destList = new ArrayList<>();
                for (String dest : destinations) {
                    destList.add(Integer.parseInt(dest.trim()));
                }
                requestsMap.put(floor, destList);
            }
        }
        reader.close();

        //Uses the constructor for LiftState
        building.lift = new LiftState(numFloors, capacity); 
        building.floors = new FloorsState(numFloors, requestsMap);

        return building;
    }

    //Getter methods to retrieve floors & lift for debugging
    public FloorsState getFloorsState() {
        return floors;
    }

    public LiftState getLiftState() {
        return lift;
    }

    //for debugging
    @Override
    public String toString() {
        return "Building[ Floors: " + floors + ", Lift: " + lift + " ]";
    }
}
