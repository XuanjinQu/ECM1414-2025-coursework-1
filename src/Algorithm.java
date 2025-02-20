
class Algorithm {
    public static void main(String[] args) {
        BuildingConfiguration Building = BuildingConfiguration.FromRandom(10, 5);

        LiftConfiguration Lift = LiftConfiguration.GetRandom(5);

        System.out.println(Building);
        System.out.println(Lift);
    }
}