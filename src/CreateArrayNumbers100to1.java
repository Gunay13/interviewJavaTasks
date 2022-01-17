import java.util.Arrays;

public class CreateArrayNumbers100to1 {
    public static void main(String[] args) {

        int [] arr=new int[100];
           int a=0;
        for (int i = 100; i >0 ; i--) {
            arr[a++]=i;
        }

        System.out.println(Arrays.toString(arr));

    }
}
