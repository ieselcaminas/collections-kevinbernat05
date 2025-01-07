public class Ejercicio5refuerzo {
    public static void main(String[] args) {
        int[] numeros = {1,2,6,17,18,22,35,46,109,143,200};
        double mediana = mediana(numeros);

        System.out.println(mediana);
    }
    public static double mediana(int[] numeros){
        int contador = 0;

        for (int i = 0; i < numeros.length; i++){
            contador++;
        }

        int mediana = numeros[numeros.length/2];

        return mediana;
    }
}
