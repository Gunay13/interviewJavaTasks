public class CountWord {
    public static void main(String[] args) {

        String sentence="Java is programming language.Java is fun and I love Java";
        String word="Java";
        int count=0;

        for (int s = 0; s < sentence.length(); s++) {
            if (sentence.contains(word)) {
                sentence = sentence.replaceFirst(word, "");
                count++;
            }
        }
        System.out.println(count);

    }
}
