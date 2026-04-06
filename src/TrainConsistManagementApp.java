import java.util.Arrays;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        String[] b1 = {"Sleeper","AC Chair","First Class","General","Luxury"};
        Arrays.sort(b1);
        System.out.println(Arrays.toString(b1));

        String[] b2 = {"Luxury","General","Sleeper","AC Chair"};
        Arrays.sort(b2);
        System.out.println(Arrays.toString(b2));

        String[] b3 = {"AC Chair","First Class","General"};
        Arrays.sort(b3);
        System.out.println(Arrays.toString(b3));

        String[] b4 = {"Sleeper","AC Chair","Sleeper","General"};
        Arrays.sort(b4);
        System.out.println(Arrays.toString(b4));

        String[] b5 = {"Sleeper"};
        Arrays.sort(b5);
        System.out.println(Arrays.toString(b5));
    }
}