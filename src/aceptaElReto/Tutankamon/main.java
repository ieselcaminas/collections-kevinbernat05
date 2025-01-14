package aceptaElReto.Tutankamon;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Tesoro> list = new ArrayList<Tesoro>();
        Tesoro a = new Tesoro("flecha",5,1);
        list.add(a);
        Tesoro b = new Tesoro("sandalias",10,2);
        list.add(b);
        Tesoro c = new Tesoro("sarcofago",1000,1000);
        list.add(c);
        Tesoro d = new Tesoro("mascara",1000,10);
        list.add(d);
        Tesoro e = new Tesoro("arco",10,2);
        list.add(e);

        list.stream()
                .sorted()
                .forEach(System.out::print);

    }
}
