import java.util.Random;

public class LiftConfiguration {
    int Capacity;

    private LiftConfiguration() {}

    public int GetCapacity() {
        return Capacity;
    }

    private void SetCapacity(int newCapacity) {
        Capacity = newCapacity;
    }

    public static LiftConfiguration GetRandom(int MaxCapacity) {
        LiftConfiguration ret = new LiftConfiguration();

        Random rand = new Random();

        ret.SetCapacity(rand.nextInt(MaxCapacity));

        return ret;
    }

    public String toString() {
        return "Lift[" + Capacity + "]";
    }
}