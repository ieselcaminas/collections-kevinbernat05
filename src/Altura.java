import java.util.ArrayList;
import java.util.Scanner;

public class Altura {
    public static void main(String[] args) {
        ArrayList<Float> alturas = new ArrayList<Float>();

        mostrarResultados(alturas);


    }
    public static int numeroAlumnos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero de alumnos: ");
        return sc.nextInt();
    }
    public static void leerAlturas(ArrayList<Float> alturas, int numAlumnos) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numAlumnos; i++) {
            System.out.println("Introduzca altura del alumno " + (i + 1) + ": ");
            float altura = sc.nextFloat();
            alturas.add(altura);
        }

    }
    public static float calcularMedia(ArrayList<Float> alturas) {
        float media = 0;
        for (int i = 0; i < alturas.size(); i++) {
            media += alturas.get(i);
        }
        return media = media / alturas.size();
    }
    public static int calcularAlumnosAlturaSuperior(ArrayList<Float> alturas) {
        int altos = 0;
        for (int i = 0; i < alturas.size(); i++) {
            if (alturas.get(i) > calcularMedia(alturas)) {
                altos++;
            }
        }
        return altos;
    }
    public static int calcularAlumnosAlturaInferior(ArrayList<Float> alturas) {
        int bajos = 0;
        for (int i = 0; i < alturas.size(); i++) {
            if (alturas.get(i) < calcularMedia(alturas)) {
                bajos++;
            }
        }
        return bajos;
    }
    public static void mostrarResultados(ArrayList<Float> alturas) {
        int numAlumnos = numeroAlumnos();
        leerAlturas(alturas, numAlumnos);

        System.out.println(calcularMedia(alturas));
        System.out.print("Alumnos por encima de la media: ");
        System.out.println(calcularAlumnosAlturaSuperior(alturas));
        System.out.print("Alumnos por debajo de la media: ");
        System.out.println(calcularAlumnosAlturaInferior(alturas));
    }


}

