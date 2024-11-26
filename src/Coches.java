import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Coches {


    public static void main(String[] args) {

        ArrayList<String> marcas = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String marca;
        do{
            marca = sc.nextLine();
            if (!marca.isEmpty())
                marcas.add(marca);
        }while(!marca.isEmpty());

        Collections.sort(marcas);
        for (int i = 0; i < marcas.size(); i++) {
            System.out.println(marcas.get(i));
        }
    }
}
