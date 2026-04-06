import java.util.*;

class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void display() {
        System.out.println("Bogie Type: " + name + " | Capacity: " + capacity);
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        try {
            Bogie b1 = new Bogie("Sleeper", 72);
            Bogie b2 = new Bogie("AC Chair", 56);
            Bogie b3 = new Bogie("First Class", 24);

            bogies.add(b1);
            bogies.add(b2);
            bogies.add(b3);

            for (Bogie b : bogies) {
                b.display();
            }

            Bogie invalid = new Bogie("Sleeper", -10);
            bogies.add(invalid);

        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }
    }
}