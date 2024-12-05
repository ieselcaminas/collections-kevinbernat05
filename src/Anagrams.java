import java.io.*;
import java.util.*;

public class Anagrams {
    public static void main(String[] args) throws IOException {
        Map<String,ArrayList<String>> map = anagrams();
    }
    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
    public static Map<String, ArrayList<String>> anagrams() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("files/spanish-dict.txt"));
        String line;

        Map<String, ArrayList<String>> map = new HashMap<>();

        while ((line = reader.readLine())!=null) {
            String ordenada = alphabetize(line);

            if (map.containsKey(ordenada)) {
                map.get(ordenada).add(line);
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(line);
                map.put(ordenada, list);
            }
        }
        reader.close();

        for (Map.Entry<String, ArrayList<String>> linea : map.entrySet()) {
                System.out.println(linea.getKey() + " - " + linea.getValue());
                System.out.println();
        }
        return map;
    }


}
