import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args) {
        System.out.println(frequency(new String[]{"uno", "uno","uno","uno", "dos", "dos"}));
    }
    public static Map<String, Integer> frequency(String[] palabras) {
        Map<String, Integer> contador = new HashMap<>();

        for (String palabra : palabras) {
            Integer cont = contador.getOrDefault(palabra, 0);
            contador.put(palabra, cont + 1);
        }
        return contador;
    }
}