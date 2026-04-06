public class TrainConsistManagementApp {
    public static void main(String[] args) {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};
        String[] empty = {};

        System.out.println(search(bogies, "BG309"));

        try {
            System.out.println(search(empty, "BG101"));
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean search(String[] arr, String key) {
        if (arr == null || arr.length == 0) {
            throw new IllegalStateException("No bogies available for search");
        }

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int result = key.compareTo(arr[mid]);

            if (result == 0) {
                return true;
            } else if (result < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}