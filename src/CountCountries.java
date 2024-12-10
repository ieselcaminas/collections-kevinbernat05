import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.*;
import java.util.*;

public class CountCountries {
    public static void main(String[] args) throws IOException {
    Map<String, Integer> paises = countCountries();

    }
    public static Map<String, Integer> countCountries() throws IOException {
        Map<String, Integer> paises = new HashMap<>();

        BufferedReader reader = new BufferedReader(new FileReader("files/Colfuturo-Seleccionados.csv"));
        String line;
        reader.readLine();

        while ((line = reader.readLine())!=null) {
            String[] pais = line.split(",");
            String country = pais[6];
            Integer freq = paises.getOrDefault(country, 0);

            if (paises.containsKey(country)) {
                paises.put(country, freq+1);
            } else {
                paises.put(country, 1);
            }
        }
        reader.close();
        for (Map.Entry<String, Integer> entry : paises.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        return paises;
    }
}