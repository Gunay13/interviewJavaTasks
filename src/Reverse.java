public class Reverse {
    public static void main(String[] args) {

        String word="Gunay";
        String reverse="";

      for (int i=word.length()-1; i>=0; i--){
          reverse+=word.charAt(i);
      }
        System.out.println(reverse);



    }
}
