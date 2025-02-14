
class Floor {
    //  each object represents a number of people
    // the value of each object represents the floor number that person wants to travel to
    int[] FloorRequests;
}

// Loads a Building configuration Object from a file path
class BuildingConfiguraiton {
    // contains any number of floors
    Floor[] Floors;

    // java.nio.file.Paths is a specialised object for storing file paths
    // prevents errors by ensuring the paths are valid
    BuildingConfiguraiton(java.nio.file.Paths FileName) {

    }
}