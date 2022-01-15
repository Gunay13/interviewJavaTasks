import java.util.Arrays;

public class MoveZerosToTheEnd1 {
    public static void main(String[] args) {

        int[] array={10,0,5,0,1,0};
        int[] result=new int[array.length];

        int i=0;
        for(int each : array){
            if(each !=0){
                result[i]=each;
                i++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
