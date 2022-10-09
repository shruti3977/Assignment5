//This Program is prepared by 21CE118 Shruti Sangani
//Part-5 Practical3
/*Aim :: : Write a program to transfer data from one file to another file so that if the destination file does
not exist, it is created.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Practical3 {
    public static void copyContent(File a, File b) throws Exception {
        FileInputStream in = new FileInputStream(a);
        FileOutputStream out = new FileOutputStream(b);
        try
        {
            int n;
            // read() function to read the byte of datat
            while ((n = in.read()) != -1)
            {
                out.write(n);// write() function to write the byte of data
            }
        }
        finally
        {
            if (in != null)
            {
                in.close();// close() function to close the stream
            }
            // close() function to close the stream
            if (out != null)
            {
                out.close();
            }
        }
        System.out.println("File Copied");
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // get the source file name
        System.out.println("Enter the source filename from where you have to read/copy :");
        String a = sc.nextLine();
        // source file
        File x = new File(a);
        // get the destination file name
        System.out.println("Enter the destination filename where you have to write/paste :");
        String b = sc.nextLine();
        File y = new File(b);
        // method called to copy the contents from x to y
        copyContent(x, y);
        sc.close();
    }
}
