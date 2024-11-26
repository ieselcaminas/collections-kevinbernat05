import java.util.ArrayList;
import java.util.Scanner;

public class Altura {
    public static int numeroAlumnos() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce numero de alumnos: ");
        return entrada.nextInt();
    }
    public static ArrayList<Double> leerAlturas(ArrayList<Double> alturas) {

        int alumnos = numeroAlumnos();
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < alumnos; i++) {
            System.out.println("Introduce la altura del alumno " + (i + 1) + ":");
            double altura = entrada.nextDouble();
            alturas.add(altura);
        }
        return alturas;

    }
    public static double calcularMedia(ArrayList<Double> alturas, double numeroAlumnos) {
        double media = 0;
        for (int i = 0; i < numeroAlumnos; i++) {
            media += alturas.get(i);
        }
        return media / alturas.size();
    }
    public static int calcularAlumnosAlturaSuperior(ArrayList<Double> alturas) {
        int masAltos = 0;

        for (int i = 0; i < alturas.size(); i++) {
            if (alturas.get(i) > calcularMedia(alturas, i)) {
                masAltos++;
            }
        }
        return masAltos;
    }
    public static int calcularAlumnosAlturaInferior(ArrayList<Double> alturas) {
        int masBajos = 0;
        for (int i = 0; i < alturas.size(); i++) {
            if (alturas.get(i) < calcularMedia(alturas, i)) {
                masBajos++;
            }
        }
        return masBajos;
    }
    public static void mostrarResultados(ArrayList<Double> alturas, int alumnosAlturaInferior, int calcularAlumnosAlturaSuperior, double media) {

        for (int i = 0; i < alturas.size(); i++) {
            System.out.println(alturas.get(i));
        }
        System.out.println("Altura media: " + media);
        System.out.println("Numero alumnos con altura superior: " + calcularAlumnosAlturaSuperior);
        System.out.println("Numero alumnos con altura inferior: " + alumnosAlturaInferior);
    }

    public static void main(String[] args) {
        ArrayList<Double> alturas = new ArrayList<Double>();

        alturas = leerAlturas(alturas);
        double media = calcularMedia(alturas, alturas.size());
        int alumnosAlturaSuperior = calcularAlumnosAlturaSuperior(alturas);
        int alumnosAlturaInferior = calcularAlumnosAlturaInferior(alturas);
        mostrarResultados(alturas, alumnosAlturaInferior, alumnosAlturaSuperior, media);
    }
}
