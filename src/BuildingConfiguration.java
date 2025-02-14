
import java.util.Random;

class Floor {
    //  each object represents a number of people
    // the value of each object represents the floor number that person wants to travel to
    public java.util.Vector<Integer> FloorRequests;
}

// Loads a Building configuration Object from a file path
class BuildingConfiguration {
    // contains any number of floors
    public java.util.Vector<Floor> Floors;

    public static BuildingConfiguration FromRandom(int MaxFloors, int MaxPeoplePerFloor) {
        Random rand = new Random();

        BuildingConfiguration Configuration = new BuildingConfiguration();

        int AmountOfFloors = rand.nextInt(MaxFloors);

        for (int i = 0; i < AmountOfFloors; i++) {
            Floor floor = new Floor();

            int AmountOfPeople = rand.nextInt(MaxPeoplePerFloor);

            for (int j = 0; i < AmountOfPeople; i++) {
                int Destination = rand.nextInt(MaxFloors);

                floor.FloorRequests.addElement(Destination);
            }

            Configuration.Floors.addElement(floor);
        }

        return Configuration;
    }
}