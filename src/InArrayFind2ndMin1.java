import java.util.Arrays;

public class InArrayFind2ndMin1 {
    public static void main(String[] args) {

        int[] arr={-55,99,-84,0,-99,85,6};
        Arrays.sort(arr);
        int min2=arr[1];
        System.out.println(min2);

    }
}
