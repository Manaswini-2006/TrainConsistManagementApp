import java.util.*;

class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {
    private String type;
    private String cargo;

    public GoodsBogie(String type) {
        this.type = type;
    }

    public void assignCargo(String cargo) {
        try {
            if (type.equalsIgnoreCase("Rectangular") && cargo.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo assignment");
            }
            this.cargo = cargo;
            System.out.println(type + " bogie assigned with cargo: " + cargo);
        } catch (CargoSafetyException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Assignment attempt completed for " + type + " bogie");
        }
    }

    public String getCargo() {
        return cargo;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        b1.assignCargo("Petroleum");
        b2.assignCargo("Coal");
        b2.assignCargo("Petroleum");

        System.out.println("Program continues...");
    }
}