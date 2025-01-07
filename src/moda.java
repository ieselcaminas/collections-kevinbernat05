import java.util.HashMap;
import java.util.Map;

public class moda {
    public static void main(String[] args) {
        int[] numeros = {1,1,1,1,2,3,4,5,6};

        System.out.println(moda(numeros));
    }
    public static int moda(int[] numeros){

        int moda = 0;

        Map<Integer, Integer> modaMap = new HashMap<Integer, Integer>();
        Integer[] values = modaMap.values().toArray(new Integer[modaMap.size()]);

        for (int i = 0; i < numeros.length; i++) {

            if (!modaMap.containsKey(numeros[i])) {
                modaMap.put(numeros[i], 1);
            } else {
                modaMap.put(numeros[i], modaMap.get(numeros[i]) + 1);
            }
        }
        int masAlto = 0;
        for (Map.Entry<Integer, Integer> entry : modaMap.entrySet()) {
            if (entry.getValue() > masAlto) {
                masAlto = entry.getValue();
                moda = entry.getKey();
            }
        }
        return moda;
    }
}
