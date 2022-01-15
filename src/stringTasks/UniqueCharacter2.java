package stringTasks;

public class UniqueCharacter2 {
    public static void main(String[] args) {

        String str=new String("AABCCDEEFGF");
        String unique="";

        for (int i = 0; i < str.length(); i++) {
            if (!unique.contains(str.charAt(i)+"")){
                int count=0;
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i)==str.charAt(j)){
                        count++;
                    }
                }
                if (count==1){
                    unique+=str.charAt(i);
                }
            }
        }
        System.out.println(unique);
    }
}
