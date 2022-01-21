import java.util.Arrays;

public class InArrayFind2ndMax2 {
    public static void main(String[] args) {
        int[] arr={2,0,8,9,45,75,66,72,36,5,3,};
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]<arr[j]){
                    max=arr[i];
                    arr[i]=arr[j];
                    arr[j]=max;

                }
            }

        }


      int max2=arr[arr.length-2];
        System.out.println(max2);


    }
}
