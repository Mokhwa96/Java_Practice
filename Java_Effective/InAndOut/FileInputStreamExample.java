package Java_Effective.InAndOut;

import java.io.FileInputStream;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try{
            FileInputStream fileInput = new FileInputStream("codestates.txt");
            int i = 0;
            while ((i = fileInput.read()) != -1) {

                System.out.print((char)i);
            }
            fileInput.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
