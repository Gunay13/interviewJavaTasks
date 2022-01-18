import java.util.Locale;

public class Initials {
    public static void main(String[] args) {

        String name="gUnay mAmmadoVa";

        String firstName=name.substring(0,1).toUpperCase();
        int indexSName=name.indexOf(" ") ;

        String secondName=name.substring(indexSName+1,indexSName+2).toUpperCase();

        System.out.println(firstName+"."+secondName);



    }
}
