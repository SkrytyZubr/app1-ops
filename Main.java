import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Piotr", "Anna", "Jan", "Leszek");
        int i = 1;
        for (String name : names) {
            System.out.println(i + " " + name);
            i++;
        }
    }
}

