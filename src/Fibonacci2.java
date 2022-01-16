public class Fibonacci2 {
    public static void main(String[] args) {
        int num1=0;
        int num2=1;
        System.out.println(num1);
        System.out.println(num2);

        for (int i = 2; i <10; i++) {
            int num3=num1+num2;
            System.out.println(num3);
            num1=num2;
            num2=num3;
        }
    }
}
