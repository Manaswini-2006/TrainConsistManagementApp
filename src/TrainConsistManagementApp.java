public class TrainConsistManagementApp {
    public static void main(String[] args) {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        System.out.println(binarySearch(bogies, "BG309"));
        System.out.println(binarySearch(bogies, "BG999"));
        System.out.println(binarySearch(bogies, "BG101"));
        System.out.println(binarySearch(bogies, "BG550"));

        String[] single = {"BG101"};
        System.out.println(binarySearch(single, "BG101"));
    }

    public static boolean binarySearch(String[] arr, String key) {
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