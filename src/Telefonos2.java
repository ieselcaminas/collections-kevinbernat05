import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telefonos2 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> contactos = new HashMap<>();
        ArrayList<Integer> telefonos = new ArrayList<>();
        telefonos.add(1111);
        telefonos.add(2222);
        contactos.put("kevin", telefonos);

        telefonos = new ArrayList<>();
        telefonos.add(3333);
        telefonos.add(4444);
        contactos.put("paquito", telefonos);

        telefonos = new ArrayList<>();
        telefonos.add(5555);
        telefonos.add(6666);
        contactos.put("ramon", telefonos);

        telefonos = new ArrayList<>();
        telefonos.add(7777);
        contactos.put("manolo", telefonos);

        agenda(contactos, "");
    }
    public static void agenda(Map<String, ArrayList<Integer>> telefonos, String nombre) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el contacto: ");
        nombre = sc.nextLine();
        String minuscula = nombre.toLowerCase();

        if (!telefonos.containsKey(minuscula)) {
            System.out.println("El telefono no está en la lista.");
        } else if (telefonos.get(minuscula).size() > 1){
            System.out.println("Los numeros de " + nombre + " son: " + telefonos.get(minuscula));
        } else {
            System.out.println("El numero de " + nombre + " es: " + telefonos.get(minuscula));
        }
    }
}
