import java.io.*;
class Test10 {
public static void main(String args[]) throws IOException
    {
        FileInputStream f = null;
        f = new FileInputStream("abc.txt");
        int i;
        while ((i = f.read()) != -1) {
            System.out.print((char)i);
        }
        f.close();
    }
}