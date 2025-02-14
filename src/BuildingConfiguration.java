
import java.util.Random;

class Floor {
    //  each object represents a number of people
    // the value of each object represents the floor number that person wants to travel to
    java.util.Vector<int> FloorRequests;
}

// Loads a Building configuration Object from a file path
class BuildingConfiguraiton {
    // contains any number of floors
    java.util.Vector<Floor> Floors;

    // java.nio.file.Paths is a specialised object for storing file paths
    // prevents errors by ensuring the paths are valid
    BuildingConfiguraiton() {}

    public static BuildingConfiguration FromRandom(uint MaxFloors = 10, uint MaxPeoplePerFloor = 10) {
        Random rand = new Random();

        BuildingConfiguraiton Configuration = new BuildingConfiguraiton();

        int AmountOfFloors = rand.nextInt(MaxFloors);

        for (int i = 0; i < AmountOfFloors; i++) {
            Floor floor = new Floor();

            AmountOfPeople = rand.nextInt(MaxPeoplePerFloor);

            for (int j = 0; i < AmountOfPeople; i++) {
                int Destination = rand.nextInt(MaxFloors);

                floor.FloorRequests.addElement(Destination);
            }

            BuildingConfiguraiton.Floors.addElement(floor);
        }
    }
}