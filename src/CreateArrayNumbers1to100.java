import java.util.Arrays;

public class CreateArrayNumbers1to100 {
    public static void main(String[] args) {

        int[] arr=new int[100];
        for (int i = 0; i <100 ; i++) {
            arr[i]=i;
        }
        System.out.println(Arrays.toString(arr));

    }
}
