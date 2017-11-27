public class StringPool {

    public static void main(String[] args) {

        String a = "Hello";  // String Literal
        String b = "Hello";

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
    }
}
