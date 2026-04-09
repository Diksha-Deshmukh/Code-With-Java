import java.util.*;

public class DuplicateFinder {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 4, 5, 3};

        for (int i = 0; i < arr.length; i++) {

            boolean checked = false;

            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    checked = true;
                    break;
                }
            }

            if (checked) continue;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate: " + arr[i]);
                    break;
                }
            }
        }
    }
}
