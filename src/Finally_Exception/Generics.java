package Finally_Exception;
import java.util.ArrayList;
public class Generics {
    public static void main(String[] args) {
        ArrayList <String> first = new ArrayList<String>();
        System.out.println(first);
        first.add("Hello");
        System.out.println(first);
        first.add("World");
        System.out.println(first);
    }
}
