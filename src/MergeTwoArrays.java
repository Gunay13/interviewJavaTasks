import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        int [] arr1= {1,2,3,4,5};
        int [] arr2={5,4,3,2,1,0,-1};

        int[] newArr=new int[arr1.length+arr2.length];
        int a=0;

        for (int i : arr1) {
            newArr[a++]=i;
        }
        for (int i : arr2) {
            newArr[a++]=i;
        }
        System.out.println(Arrays.toString(newArr));
    }
}
