package stringTasks;

public class ConvertStringLetterAndNumber {
    public static void main(String[] args) {
        String str="a1b5c3";
        System.out.println( returnString(str));
    }

    public static String returnString(String str){
        String returnStr = "";
        for (int i = 0; i < str.length(); i++) {
            int num=0;
            if (Character.isAlphabetic(str.charAt(i))){
                returnStr+=str.charAt(i);
            }else if (Character.isDigit(str.charAt(i))){
                num=Integer.parseInt(str.charAt(i)+"");
                if (num==1){
                    continue;
                }else {
                    for (int j = 0; j <num-1 ; j++) {
                        returnStr+=returnStr.charAt(returnStr.length()-1);
                    }
                }
            }
        }
        return  returnStr;

    }
}
/*
input  : a1b5c3
output : abbbbbccc
 */