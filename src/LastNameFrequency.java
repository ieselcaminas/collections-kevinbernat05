import java.io.IOException;
import java.util.Map;
import java.io.*;
import java.util.*;

public class LastNameFrequency {
    public static void main(String[] args) throws IOException {
        Map<String, String> apellidos = apellidos();

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el apellido: ");
        String introducido = sc.nextLine();

        System.out.println("El apellido " + introducido + " es " + apellidos.get(introducido));
    }

    public static Map<String,String> apellidos() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("files/LastnameFrequencies.csv"));
        String line;
        Map<String, String> apellidos = new HashMap<>();


        while ((line = reader.readLine()) != null) {
            String[] partes = line.split(",");
            if (partes.length != 2) continue;
            String apellido = partes[0];
            String frecuencias = partes[1];

            apellidos.put(apellido, frecuencias);
        }

        reader.close();
        return apellidos;
    }
}


