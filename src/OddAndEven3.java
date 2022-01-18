import java.util.ArrayList;
import java.util.Arrays;

public class OddAndEven3 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
       list.addAll(Arrays.asList(1,2,3,4,5,6,8,24,25));

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2==0){
                System.out.print("Even ");
            }else{
                System.out.print("Odd ");
            }
        }

    }
}
