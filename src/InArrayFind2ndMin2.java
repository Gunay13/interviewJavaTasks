import java.lang.reflect.Array;
import java.util.Arrays;

public class InArrayFind2ndMin2 {
    public static void main(String[] args) {

        int[] arr = {-55, 99, -84, 0, -99, 85, 6};
        int temp = arr[0];

        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr.length; i1++) {
                if (arr[i] < arr[i1]) {
                    temp = arr[i];
                    arr[i] = arr[i1];
                    arr[i1] = temp;
                }
            }
        }
        int min2 = arr[1];
        System.out.println(min2);

    }
}
