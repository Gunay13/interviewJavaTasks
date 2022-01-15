public class EveryCharacter {
    public static void main(String[] args) {

        String str="abbcddeff";
        String everyChar="";

        for (int i = 0; i < str.length(); i++) {
            if (!everyChar.contains(str.charAt(i)+"")){
                everyChar+=str.charAt(i);
            }
        }
        System.out.println(everyChar);

    }
}

