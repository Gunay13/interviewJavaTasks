public class FindMinimum1 {
    public static void main(String[] args){
        int [] arr={5,8,1,7,9,-5,2,5,4,3};
        int min=arr[0];

        for (int i : arr) {
            if (min>i){
                min=i;
            }
        }

        System.out.println(min);



    }
}
