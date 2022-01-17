public class FizzBuzz1 {
    public static void main(String[] args) {

        String text="";

        for (int i = 1; i <=50; i++) {
            text+=(i%3==0 && i%5==0)?"FizzBuzz ":(i%5==0)?"Fizz ":(i%3==0)?"Buzz ":i+" ";
        }
        System.out.println(text);

    }

}
