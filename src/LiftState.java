import java.util.Random;

// Represents a Lift with different variables denoting properties
public class LiftState {
    // how many people can simultaneously use the lift
    int Capacity;

    // private default constructor
    // stop mistakes by marking private bad things could happen if this object is default initialised
    private LiftState() {}

    // Getter for capacity
    public int GetCapacity() {
        return Capacity;
    }

    // Setter for capacity
    // marked as private to prevent capacity being changed mid-algorithm or something
    private void SetCapacity(int newCapacity) {
        Capacity = newCapacity;
    }

    // helper function to generate a random valid lift configuration
    // parameters are various bounds on lift properties
    public static LiftState FromRandom(int MaxCapacity) {
        LiftState ret = new LiftState();

        Random rand = new Random();

        ret.SetCapacity(rand.nextInt(MaxCapacity));

        return ret;
    }

    // debugging utility to print contents simply
    public String toString() {
        return "Lift[MaxCapacity = " + Capacity + "]";
    }
}