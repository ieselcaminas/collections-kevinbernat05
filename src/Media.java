import java.util.ArrayList;
import java.util.Collections;

public class Media {
    public static void main(String[] args) {
        ArrayList<Integer> coches = new ArrayList<Integer>();
        coches.add(1);
        coches.add(2);
        coches.add(3);
        coches.add(4);

        int media = 0;
        int suma = 0;

        for (int i = 0; i < coches.size(); i++) {
            suma = suma + coches.get(i);
        }

        media = suma / coches.size();

        System.out.println(media);

        Collections.sort(coches);

        System.out.println(coches);
    }
}