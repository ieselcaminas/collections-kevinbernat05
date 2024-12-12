import java.util.Stack;

public class aritmeticas {
    public static void main(String[] args) {
        pila();


    }
    public static void pila() {
        Stack<Integer> pila = new Stack();
        String cadena = "8 1 19 -";
        String[] numeros = cadena.split(" ");

        if(esNumero(cadena)) {
            for (String numero : numeros) {
                if (Character.isDigit(numero.charAt(0))) {
                    pila.push(Integer.parseInt(numero));
                } else {
                    int a = Integer.parseInt(pila.pop().toString());
                    int b = Integer.parseInt(pila.pop().toString());
                    switch (numero.charAt(0)) {
                        case '+':
                            pila.push(b + a);
                            break;
                        case '-':
                            pila.push(b - a);
                            break;
                        case '*':
                            pila.push(b * a);
                            break;
                        case '/':
                            pila.push(b / a);
                            break;
                    }
                }
            }
        } else {
            System.out.println("Error la cadena tiene que empezar por un numero.");
        }
        System.out.println(pila);
    }
    public static boolean esNumero(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isDigit(cadena.charAt(0))) {
                return true;
            }
        }
        return false;
    }
}
