package stringTasks;

public class Palindrome {
    public static void main(String[] args) {
        String ward= new String("Level");
        String polindromeWord="";

        for (int i = ward.length()-1; i >=0; i--) {
            polindromeWord+=ward.charAt(i);

        }
        System.out.println(polindromeWord.equalsIgnoreCase(ward));

    }
}
