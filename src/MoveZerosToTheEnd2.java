import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosToTheEnd2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter Arrays length");
        int num = scan.nextInt();
        int[] arr = new int[num];
        int[] arrNew = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Enter number: ");
            arr[i] = scan.nextInt();
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                arrNew[count] = arr[j];
                count++;
            }
        }

        System.out.println(Arrays.toString(arrNew));



    }
}
