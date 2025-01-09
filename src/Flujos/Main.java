package Flujos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> personas = new ArrayList<>();
        Person a = new Person("Kevin", "Romero", 2000);
        personas.add(a);
        Person b = new Person("Paco", "Alvarez", 1980);
        personas.add(b);
        Person c = new Person("Alba", "Ramirez", 1990);
        personas.add(c);

        contarPersonas(personas);

        List<String> ordenadas = personas.stream()
                .map(Person -> Person.getFirstName())
                .sorted()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(ordenadas);

    }
    public static void contarPersonas(List<Person> personas) {
        System.out.println("Cuantos con A: " + personas.stream().filter(n -> n.getFirstName().startsWith("A")).count());
    }
}
