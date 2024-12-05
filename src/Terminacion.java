import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Terminacion {
    public static void main(String[] args) {
        System.out.println(terminaciones(new String[]{"03943", "93494", "23124", "21315"}));
    }
    public static Map<Character, Integer> terminaciones(String[] boletos) {
        Map<Character, Integer> terminaciones = new HashMap<>();

        Character ultimo;
        Integer cont;

        for (String boleto : boletos) {
            ultimo = boleto.charAt(boleto.length() - 1);
            cont = terminaciones.get(ultimo);
            if (cont == null) {
                terminaciones.put(ultimo, 1);
            } else {
                terminaciones.put(ultimo, cont + 1);
        }
        }
        return terminaciones;
    }
}


