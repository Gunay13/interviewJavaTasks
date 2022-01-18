public class OddAndEven2 {
    public static void main(String[] args) {

        String textEven="";
        String textOdd="";
        for (int i = 2; i <=100 ; i++) {
            if (i%2==0){
                textEven+=i+" ";
            }else{
                textOdd+=i+" ";
            }
        }
        System.out.println("Even number :"+textEven);
        System.out.println("Odd number :"+textOdd);


    }
}
