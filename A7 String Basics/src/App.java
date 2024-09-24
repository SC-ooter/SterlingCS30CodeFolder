public class App {
// Program name: (A7 String Basics)

// Student name: (Sterling Cossar)

// Date: (September 24th 2024)

// Program Description: 
    
    public static void main(String[] args) throws Exception {
        String message1 = "I am very happy!";
        String target1 = "very";

        String message2 = "That was great - lol";
        String target2 = "lol";

        //Message 1
        Integer message1pos1 = (message1.indexOf(target1));
        Integer message1pos2 = (target1.length());
        System.out.println(message1.substring(0,message1pos1 - 1)+ message1.substring(message1pos1 + message1pos2));

        //Message 2
        Integer message2pos1 = (message2.length());
        Integer message2pos2 = (target2.length());
        System.out.println(message2.substring(0,message2pos1 - message2pos2) + ("laugh out loud"));
      
 }
}
