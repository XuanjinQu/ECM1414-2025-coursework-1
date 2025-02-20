
class Algorithm {
    public static void main(String[] args) {
        // generate a random building configuration
        BuildingConfiguration Building = BuildingConfiguration.FromRandom(10, 5);

        // generate a random lift configuration
        LiftConfiguration Lift = LiftConfiguration.GetRandom(5);

        // for debugging
        System.out.println(Building);
        System.out.println(Lift);
    }
}