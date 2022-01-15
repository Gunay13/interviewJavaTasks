package stringTasks;

public class UniqueCharacter1 {
    public static void main(String[] args) {

        String str="ABBCCDEEFG";
        String unique="";

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
                unique+=str.charAt(i);
            }
        }
        System.out.println(unique);


    }
}
