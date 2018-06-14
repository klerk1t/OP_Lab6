import java.io.*;
public class Main {
    public static void main(String[] args) throws  IOException{
        FileInputStream fileInputStream = new FileInputStream("res/input.txt");
        int length = fileInputStream.available();
        byte data[] = new byte[length];

        fileInputStream.read(data);
        fileInputStream.close();

        String inputFile = new String(data);

        String operation[] = inputFile.split(";");

        int count = 0;

        for(int i = 0; i < operation.length; i++) {
            if(!operation[i].substring(0, 1).equals("S")) {
                count++;
            }
        }
        String[] var = new String[count];
        int hashTable[] = new int[count];

        for(int i = 0; i < operation.length; i++) {
            if(!operation[i].substring(0, 1).equals("S")) {
                hashTable[i] = Integer.parseInt(operation[i].substring(operation[i].lastIndexOf(" ") + 1));
                var[i] = operation[i].substring(0, operation[i].indexOf(" "));
            }
        }
        for(String x : var)
            System.out.println(x);

        for(int x : hashTable)
            System.out.println(x);
        //System.out.println(inputFile);
    }
}
