package arrayTasks;

public class FindMaximum1 {
    public static void main(String[] args) {
        int [] arr={5,8,1,7,9,2,5,4,3};
        int max=arr[0];

        for (int i : arr) {
            if (max<i){
                max=i;
            }
        }

        System.out.println(max);

    }
}
