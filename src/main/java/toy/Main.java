package toy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ToyLottery lottery = new ToyLottery();
        lottery.put("1 конструктор 20");
        lottery.put("2 робот 20");
        lottery.put("3 кукла 60");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("result.txt"))) {
            for (int i = 0; i < 10; i++) {
                int toyId = lottery.get();
                writer.write("Выпала игрушка с ID: " + toyId);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
