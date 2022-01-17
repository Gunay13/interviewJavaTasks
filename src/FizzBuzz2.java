import java.util.Scanner;

public class FizzBuzz2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=scan.nextInt();
        String text="";
        if (num%15==0){
            text="FizzBuzz";
        }else if (num%3==0){
            text="Fizz";
        }else if (num%5==0){
            text="Buzz";
        }else{
            text=num+"";
        }

        System.out.println(text);

    }
}
