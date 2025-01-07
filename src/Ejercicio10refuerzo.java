public class Ejercicio10refuerzo {
    public static void main(String[] args) {

        int compartimentos = 5;
        int maxLitros = 300;
        int diferencia = 10;

        System.out.println(litros(compartimentos, maxLitros, diferencia));


    }
    public static int litros(int compartimentos, int maxLitros, int diferencia){
        int litros = 0;

        for (int i = 0; i < compartimentos; i++) {
            litros = litros + maxLitros;
        }
        return litros;
    }
}
