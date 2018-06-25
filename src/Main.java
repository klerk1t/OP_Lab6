import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream("res/input.txt");
        int length = input.available();
        byte[] data = new byte[length];
        input.read(data);
        input.close();

        Hashtable<String, Integer> map = new Hashtable<String, Integer>();

        String inputFile = new String(data);
        String operations[] = inputFile.split("\r\n");
        String var[] = new String[operations.length - 1];
        String calculate =
                operations[operations.length - 1].substring(0, operations[operations.length - 1].indexOf(";"));
        for(int i = 0; i < var.length; i++) {
            var[i] = operations[i];
        }
        for (String x : var) {
            String key = x.substring(0, x.indexOf(" "));
            int val = Integer.parseInt(x.substring(x.lastIndexOf(" ") + 1, x.indexOf(";")));
            map.put(key, val);
            System.out.println(key + "__" + map.get(key));
        }
        System.out.println(calculate);

    }
}
