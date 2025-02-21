public final class Building {
    private FloorsState floors;
    private LiftState lift;

    private Building() {}

    public static Building FromRandom(BuildingRandomParameters parameters) {
        Building building = new Building();

        building.lift = LiftState.FromRandom(parameters.liftParameters.maxCapacity);
        building.floors = FloorsState.FromRandom(parameters.floorParameters.maxFloors, parameters.floorParameters.maxPeoplePerFloor);

        return building;
    }

    public String toString() {
        return "Building[" + floors + ", " + lift + "]";
    }
}
