package Comparable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Ej3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("src/Comparable/illiterate.csv"));
        String line;

        List<Analfabetos> lista = new ArrayList<>();
        reader.readLine();

        while ((line = reader.readLine()) != null) {

            String[] split = line.split(",");
            String pais = split[5].trim();
            int cantidad = Integer.parseInt(split[8].trim());
            Analfabetos a = new Analfabetos(pais, cantidad);
            lista.add(a);
        }

        reader.close();

        lista.stream()
                .sorted()
                .forEach(System.out::println);
    }
}

