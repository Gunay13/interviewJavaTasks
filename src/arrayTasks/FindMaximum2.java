package arrayTasks;

public class FindMaximum2 {
    public static void main(String[] args) {
        int [] arr={5,8,1,7,100,9,2,5,10,4,3};
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);

    }
}
