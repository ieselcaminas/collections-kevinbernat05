import java.util.Arrays;

public class Ejercicio6refuerzo {
    public static void main(String[] args) {
        int[] numeros = {3,1,5,4};

        if (cualFalta(numeros)!= -1){
            System.out.println(cualFalta(numeros));
        } else {
            System.out.println("No falta ninguno");
        }
    }

    public static int cualFalta(int[] numeros) {

        Arrays.sort(numeros);

        int x = 0;

        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i + 1] - numeros[i] == 2) {
                x = numeros[i] + 1;
                break;
            } else {
                x = -1;
            }
        }
        return x;
    }
}


