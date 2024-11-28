import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telefonos {
    public static void main(String[] args) {
        Map<String, Integer> telefonos = new HashMap<>();
        telefonos.put("kevin", 4444 );
        telefonos.put("ramon", 3333);
        telefonos.put("paquito", 2222);
        telefonos.put("sofia", 1111);

        capitales(telefonos, "");
    }
    public static void capitales(Map<String, Integer> telefonos, String nombre) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el contacto: ");
        nombre = sc.nextLine();
        String minuscula = nombre.toLowerCase();

        if (!telefonos.containsKey(minuscula)) {
            System.out.println("El telefono no está en la lista.");
        } else {
            System.out.println("El numero de " + nombre + " es: " + telefonos.get(minuscula));
        }
    }
}
