import java.util.ArrayList;
import java.util.Arrays;

public class OddAndEven4 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 99, 55, 3, 4, 5, 6, 8, 24, 25,102));


        for (Integer each : list) {
            if (each% 2 == 0) {
                System.out.print("Even ");
            } else {
                System.out.print("Odd ");
            }
        }

    }
}