import java.util.Arrays;

class PassengerBogieSorter {
    public static void bubbleSort(int[] capacities) {
        int n = capacities.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        int[] capacities1 = {72, 56, 24, 70, 60};
        PassengerBogieSorter.bubbleSort(capacities1);
        System.out.println(Arrays.toString(capacities1));

        int[] capacities2 = {24, 56, 60, 70, 72};
        PassengerBogieSorter.bubbleSort(capacities2);
        System.out.println(Arrays.toString(capacities2));

        int[] capacities3 = {72, 56, 56, 24};
        PassengerBogieSorter.bubbleSort(capacities3);
        System.out.println(Arrays.toString(capacities3));

        int[] capacities4 = {50};
        PassengerBogieSorter.bubbleSort(capacities4);
        System.out.println(Arrays.toString(capacities4));

        int[] capacities5 = {40, 40, 40};
        PassengerBogieSorter.bubbleSort(capacities5);
        System.out.println(Arrays.toString(capacities5));
    }
}