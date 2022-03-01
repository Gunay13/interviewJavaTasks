package arrayTasks;

public class SameCauntCatAndDog {
    public static void main(String[] args) {
        String sentence="1cat1catdodog";
int catCount=0;
int dogCount=0;
String cat="";
String dog="";
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.contains("cat")){
                catCount++;
               sentence= sentence.replaceFirst("cat","");

            }
            if (sentence.contains("dog")){
                dogCount++;
               sentence= sentence.replaceFirst("dog","");
            }

        }
        if (catCount==dogCount){
            System.out.println(true);
        }else {
            System.out.println(false);
        }




    }
}
