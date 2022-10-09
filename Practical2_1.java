//This Program is prepared by 21CE118 Shruti Sangani
//Part-5 Practical2_1
/*Aim :: When to use Character Stream over Byte Stream? When to use Byte Stream over Character
Stream? Give example.
 */
import java.io.FileReader;
import java.io.IOException;

public class Practical2_1 {
    public static void main(String[] args) throws IOException
    {
        // Initially assigning null as we have not read anything
        FileReader sourceStream = null;
        // Try block to check for exceptions
        try
        {
            // Reading from filex
            sourceStream = new FileReader("C:\\Users\\dell\\IdeaProjects\\Assignment5\\Practical_5_2.txt");
            // Reading sourcefile and writing content to target file character by character.
            int temp;
            // If there is content inside file than read
            while ((temp = sourceStream.read()) != -1)
            {
                System.out.println((char) temp);
            }
            // Display message for successful execution of program
            System.out.print("Program successfully executed");
        }
        // finally block that executes for sure where we are closing file connections to
        // avoid memory leakage
        finally
        {
            // Closing stream as no longer in use
            if (sourceStream != null)
                sourceStream.close();
        }
    }
}
