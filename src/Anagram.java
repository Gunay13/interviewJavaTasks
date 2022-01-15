import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String word1="ABC";
        String word2=new String("BAC");

        String[] arr1=word1.split("");
        String[] arr2=word2.split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr1, arr2));

    }
}
