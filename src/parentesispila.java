import java.util.Stack;

public class parentesispila {
    public static void main(String[] args) {
        System.out.println(esBalanceado("{([()])}"));
    }
    public static boolean esBalanceado(String cadena){
        boolean balanced = false;
        Stack<Character> pila = new Stack<>();
        char ultimo;

        for(int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '(' || cadena.charAt(i) == '{' || cadena.charAt(i) == '[') {
                pila.push(cadena.charAt(i));
            } else if (cadena.charAt(i) == ')') {
                ultimo = pila.pop();
                if (ultimo != '(') {
                    return false;
                }
            } else if (cadena.charAt(i) == '}') {
                ultimo = pila.pop();
                if (ultimo != '{') {
                    return false;
                }
            } else if (cadena.charAt(i) == ']') {
                ultimo = pila.pop();
                if (ultimo != '[') {
                    return false;
                }
            }
        }



        return pila.isEmpty();
    }
}
