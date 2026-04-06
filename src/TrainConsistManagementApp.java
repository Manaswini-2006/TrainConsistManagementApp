public class TrainConsistManagementApp {
    public static void main(String[] args) {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};

        System.out.println(search(bogies, "BG309"));
        System.out.println(search(bogies, "BG999"));
        System.out.println(search(bogies, "BG101"));
        System.out.println(search(bogies, "BG550"));

        String[] single = {"BG101"};
        System.out.println(search(single, "BG101"));
    }

    public static boolean search(String[] arr, String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {
                return true;
            }
        }
        return false;
    }
}