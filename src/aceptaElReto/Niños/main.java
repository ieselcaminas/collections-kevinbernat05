package aceptaElReto.Niños;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Regalo> list = new ArrayList<>();

        Regalo a = new Regalo(80,2);
        list.add(a);
        Regalo b = new Regalo(100,12);
        list.add(b);
        Regalo c = new Regalo(100,1);
        list.add(c);

        list.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
