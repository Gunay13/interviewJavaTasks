public class FindMinimum2 {
    public static void main(String[] args) {
        int [] arr={5,8,1,7,100,9,2,5,10,0,4,3};
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);


    }
}
