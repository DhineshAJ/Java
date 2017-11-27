public class Pract {

    public static void main(String[] args) {

        String a = "Hello";  // String Literal
        String b = "Hello ";

        if (a == b) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");

        }

        String ab = new String("Hello");   // String Object
        String ac = new String("Hello");

        if (ab == ac) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");

        }

        System.out.println(a.equals(b));

        System.out.println(a.length());

        System.out.println(a.compareTo(ab));

        System.out.println(a.indexOf('e'));

        System.out.println(a.charAt(1));

        System.out.println(a.substring(2));

        System.out.println(b.trim());


    }
}
