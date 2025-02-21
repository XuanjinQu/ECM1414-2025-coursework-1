
class ElevatorApp {
    public static void main(String[] args) {
        FloorsRandomParameters floorsRandomParameters = new FloorsRandomParameters();

        floorsRandomParameters.maxFloors = 10;
        floorsRandomParameters.maxPeoplePerFloor = 5;

        LiftRandomParameters liftRandomParameters = new LiftRandomParameters();

        liftRandomParameters.maxCapacity = 5;

        BuildingRandomParameters buildingRandomParameters = new BuildingRandomParameters();

        buildingRandomParameters.floorParameters = floorsRandomParameters;
        buildingRandomParameters.liftParameters = liftRandomParameters;

        // generate a random building configuration
        Building building = Building.FromRandom(buildingRandomParameters);

        // for debugging
        System.out.println(building);
    }
}