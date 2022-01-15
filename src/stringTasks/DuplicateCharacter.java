package stringTasks;

public class DuplicateCharacter {
    public static void main(String[] args) {

        String str=new String("AABCCCDDEEFD");
        String dup="";

        for (int i = 0; i < str.length(); i++) {
            if (!dup.contains(str.charAt(i)+"")){
                int count=0;
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i)==str.charAt(j)){
                        count++;
                    }
                }
                if (count>1){
                    dup+=str.charAt(i);
                }
            }
        }
        System.out.println(dup);

    }
}
