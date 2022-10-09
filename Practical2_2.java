//This Program is prepared by 21CE118 Shruti Sangani
//Part-5 Practical2_2
/*Aim :: When to use Character Stream over Byte Stream? When to use Byte Stream over Character
Stream? Give example.
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practical2_2
{
    public static void main(String[] args) throws IOException {
        // Initially assigning null ot objects for
        // reading and writing to file
        FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;
        // Try block to check for exceptions
        try {
            // Passing the files via local directory
            sourceStream = new FileInputStream("C:\\Users\\dell\\IdeaProjects\\Assignment5\\Practical_5_2.txt");
            targetStream = new FileOutputStream("C:\\Users\\dell\\IdeaProjects\\Assignment5\\Practical_5_2_copy.txt");
                    // Reading source file and writing content to
                    // target file byte by byte
            int temp;
            // If there is content inside file
            // than read
            while ((temp = sourceStream.read()) != -1) {
                targetStream.write((byte) temp);
            }
            // Display message for successful execution of program
            System.out.print("Program successfully executed");
        }
        // finally block that executes for sure
        // where we are closing file connections
        // to avoid memory leakage
        finally
        {
            if (sourceStream != null)
                sourceStream.close();
            if (targetStream != null)
                targetStream.close();
        }
    }

}
