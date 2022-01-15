import java.util.ArrayList;
import java.util.Arrays;

public class MoveZerosToTheEnd3 {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(0,1,2,0,5,30,1,5,0));
        ArrayList<Integer> list2=new ArrayList<>();
        for (Integer integer : list) {
            if (integer!=0){
                list2.add(integer);
            }
        }
        for (Integer integer : list) {
            if (integer==0){
                list2.add(integer);
            }
        }
        System.out.println(list2);

    }
}
