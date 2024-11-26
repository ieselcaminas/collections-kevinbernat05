import java.util.ArrayList;

public class Ejemplo {
    public static void main(String[] args) {
        ArrayList<String> coches = new ArrayList<String>();
        coches.add("Seat");
        coches.add("Mercedes");
        coches.add("Audi");
        coches.add("BMW");

        System.out.println(coches.get(coches.size()-1));

        for (int i = 0; i < coches.size(); i++) {
            System.out.println(coches.get(i));
        }

        coches.remove(0);

        if (coches.isEmpty()) {
            System.out.println("ArrayList vacio");
        }

        int media = 0;
    }
}
