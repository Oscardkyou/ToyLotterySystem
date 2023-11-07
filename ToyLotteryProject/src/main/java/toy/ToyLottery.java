package toy;

import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.Random;

public class ToyLottery {
    private PriorityQueue<Toy> queue;
    private Random random;

    public ToyLottery() {
        this.queue = new PriorityQueue<>(Comparator.comparingInt(Toy::getFrequency));
        this.random = new Random();
    }

    public void put(String data) {
        Toy toy = new Toy(data);
        for (int i = 0; i < toy.getFrequency(); i++) {
            queue.add(toy);
        }
    }

    public int get() {
        if (queue.isEmpty()) {
            return -1;
        }
        Toy toy = queue.poll();
        return toy.getId();
    }
}
