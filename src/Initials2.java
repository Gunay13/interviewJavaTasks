public class Initials2 {
    public static void main(String[] args) {

            String name = "gunay mammadova";
            System.out.println(name.substring(0,1).toUpperCase() + "." + name.substring((name.indexOf(" ") + 1), name.indexOf(" ") + 2).toUpperCase());
    }
}
