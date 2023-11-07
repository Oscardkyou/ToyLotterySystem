package toy;

public class Toy {
    private int id;
    private String name;
    private int frequency; // Частота выпадения

    public Toy(String data) {
        String[] parts = data.split("\\s+");
        this.id = Integer.parseInt(parts[0]);
        this.name = parts[1];
        this.frequency = Integer.parseInt(parts[2]);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getFrequency() {
        return frequency;
    }
}
