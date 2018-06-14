import java.io.*;
public class Main {
    public static void main(String[] args) throws  IOException{
        FileInputStream fileInputStream = new FileInputStream("res/input.txt");
        int length = fileInputStream.available();
        byte data[] = new byte[length];

        fileInputStream.read(data);
        fileInputStream.close();

        String inputFile = new String(data);



        System.out.println(inputFile);
    }
}
