import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PaisCapital {
    public static void main(String[] args) {
        Map<String, String> paisCapital = new HashMap<String, String>();
        paisCapital.put("españa", "Madrid");
        paisCapital.put("portugal", "Lisboa");
        paisCapital.put("italia", "Roma");
        paisCapital.put("alemania", "Berlin");

        capitales(paisCapital, "");
    }
    public static void capitales(Map<String, String> paisCapital, String pais) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el pais: ");
        pais = sc.nextLine();
        String minuscula = pais.toLowerCase();

        if (!paisCapital.containsKey(minuscula)) {
            System.out.println("El pais no está.");
        } else {
            System.out.println("La capital de " + pais + " es: " + paisCapital.get(minuscula));
        }
    }
}
