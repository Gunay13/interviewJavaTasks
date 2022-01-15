public class CountEachCharacter {
    public static void main(String[] args) {

        String str1="ABBCCDEFFEG";
        String str2="";

        for (int i = 0; i < str1.length(); i++) {
            if (!str2.contains(str1.charAt(i)+"")){
                int count=0;
                for (int j = 0; j < str1.length(); j++) {
                    if (str1.charAt(i)==str1.charAt(j)){
                        count++;
                    }
                }
               str2+=str1.charAt(i)+""+count;
                }
            }
        System.out.println(str2);
    }
}
