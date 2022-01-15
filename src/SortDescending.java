import java.sql.Array;
import java.util.Arrays;

public class SortDescending {
    public static void main(String[] args) {

        int[] arr={5,9,1,7,3,8,4,6,2,0};
        Arrays.sort(arr);

        int [] arr2=new int[arr.length];
        int a=0;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr2[a++]=arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }
}
