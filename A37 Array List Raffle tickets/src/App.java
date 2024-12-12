import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String[] names = new String[]{"Mannion", "Fox", "Wolf", "Sutter", "Bacheleu", "Zeck", "Robertson", "Kosloski", "Cook", "Maier"};
        List<String> Arraylists = new ArrayList<String>();
        System.out.println("Names :" + Arrays.toString(names));
        System.out.println(names.length);
        names.remove(5);
        System.out.println(names);
        }


    }
