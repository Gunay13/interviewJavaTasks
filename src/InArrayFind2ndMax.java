import java.util.Arrays;

public class InArrayFind2ndMax {
    public static void main(String[] args) {
        int[] arr={2,0,8,9,45,75,66,36,5,3,};
        Arrays.sort(arr);

        int max2=arr[arr.length-2];
        System.out.println(max2);

    }
}
