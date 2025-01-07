public class Ejercicio3refuerzo {
    public static void main(String[] args) {
        int x = 3433;
        if (sumaNoNegativo(x) != -1) {
            suma(x);
        } else {
            System.out.println("Suma negativa");
        }
    }
    public static int sumaNoNegativo(int x) {
        String numeros = String.valueOf(x);
        int resultado = 0;
        if (x > 0) {
            for (int i = 0; i < numeros.length(); i++) {
                String y = String.valueOf(numeros.charAt(i));
                resultado = resultado + Integer.parseInt(y);
            }
        } else {
            return -1;
        }
        return resultado;
    }
    public static void suma(int x) {
        int resultado = sumaNoNegativo(x);
        String numeros = String.valueOf(x);

        String suma = "";

        for (int i = 0; i < numeros.length(); i++) {
            System.out.print(numeros.charAt(i));
            if (i < numeros.length() - 1) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + resultado);
    }
}
