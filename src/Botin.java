import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Botin {
    public static void main(String[] args) {
        Map<Integer, String> participantes = repartir(3, new String[]{"10", "20", "50", "100"});



    }
    public static Map<Integer, String> repartir(int numeroparticipantes, String[] billetes) {
        Map<Integer, String> repartos = new HashMap<>();
        int leTocaA;
        String billete;
        String botin;

        for (int i = 0; i < billetes.length; i++) {
            leTocaA = i % numeroparticipantes;
            if (!repartos.containsKey(leTocaA)) {
                repartos.put(leTocaA, billetes[i]);
            } else {
                repartos.put(leTocaA, billetes[i] + " " + repartos.get(leTocaA));
            }
            //repartos.put(repartos.getOrDefault(leTocaA, billetes[i] + " " + repartos.get(leTocaA))
        }



        return repartos;
    }
}
