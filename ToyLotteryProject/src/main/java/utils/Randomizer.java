import java.util.Random;

public class Randomizer {
    private static final Random random = new Random();

    public static int getRandomWeightedIndex(int[] weights) {
        int totalWeight = 0;
        for (int weight : weights) {
            totalWeight += weight;
        }
        int index = 0;
        for (int r = random.nextInt(totalWeight); index < weights.length - 1; ++index) {
            r -= weights[index];
            if (r < 0) {
                break;
            }
        }
        return index;
    }
}
