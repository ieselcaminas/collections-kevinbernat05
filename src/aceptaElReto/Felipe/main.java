package aceptaElReto.Felipe;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Felipe> list = new ArrayList<Felipe>();
        Felipe a = new Felipe(1, 6);
        list.add(a);
        Felipe b = new Felipe(2, 4);
        list.add(b);
        Felipe c = new Felipe(3, 5);
        list.add(c);
        Felipe d = new Felipe(30, 7);
        list.add(d);
        Felipe e = new Felipe(30, 2);
        list.add(e);

        list.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
