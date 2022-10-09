//This Program is prepared by 21CE118 Shruti Sangani
//Part-5 Practical4
//Aim ::  Write a program to show use of character and byte stream
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practical4
{
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("InputFile.jpg");
            fos = new FileOutputStream("OutputFile.jpg");
            int temp;
            while ((temp = fis.read()) != -1) {
                fos.write(temp);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally
        {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
