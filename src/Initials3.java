import java.util.Scanner;

public class Initials3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your first name : ");
        String firstName=scan.next();
        System.out.println("Please enter your last name : ");
        String lastName=scan.next();

        firstName=firstName.toUpperCase().charAt(0)+"";
        lastName=lastName.toUpperCase().charAt(0)+"";
        System.out.println(firstName+"."+lastName);

    }
}
