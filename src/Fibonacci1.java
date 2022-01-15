import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How many number do you want be fibonacci?");
        int fibonacci=scan.nextInt();
        int[] arr=new int[fibonacci];
        int num1=0;
        arr[0]=num1;
        int num2=1;
        arr[1]=num2;
        int total=0;
        int a=2;
        for (int i = 2; i <fibonacci ; i++) {
            total=num1+num2;
            arr[a++]=total;
            num1=num2;
            num2=total;

        }
        System.out.println(Arrays.toString(arr));

    }
}
