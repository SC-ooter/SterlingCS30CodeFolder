public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String message1 = "This is a test";
        String message2 = "Hello class";

        System.out.println(message1.length());
        System.out.println(message2.length());

        System.out.println(message1.substring(0,3));
        System.out.println(message2.substring(5));

        System.out.println(message1.indexOf("is"));
        System.out.println(message1.indexOf("Hello"));
        System.out.println(message2.indexOf("Hello"));

    }
}
