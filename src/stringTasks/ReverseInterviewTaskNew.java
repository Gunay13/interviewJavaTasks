package stringTasks;

public class ReverseInterviewTaskNew {
    public static void main(String[] args) {

        String str = "abcd!ef";

        String result="";
        int index=str.indexOf("!");
        str=str.replaceAll("!","");

        for (int i = 0; i < str.length(); i++) {
            result=str.charAt(i)+result;
        }
        result=result.substring(0,index)+"!"+result.substring(index);
        System.out.println(result);

    }
}
    // input: "abcd!ef"
    // output: "fedc!ba"