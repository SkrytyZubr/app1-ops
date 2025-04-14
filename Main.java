//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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

