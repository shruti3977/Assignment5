//This Program is prepared by 21CE118 Shruti Sangani
//Part-5 Practical5
/*Aim :: Write a program to enter any 15 numbers from the user and store only even numbers in a file
named “Even.txt”. And display the contents of this file on the console. (BufferedReader /
BufferedWriter).
 */
import java.io.*;
import java.util.Scanner;

public class Practical5 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[15];
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        FileWriter f;
        try {
            f = new FileWriter("Practical_5_5.txt");
            BufferedWriter bf = new BufferedWriter(f); // BufferedWriter to write the data in the file
            for (i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0) {
                    bf.write(arr[i] + " ");
                }
            }
            bf.close(); // close() function to close the stream
        } catch (IOException e) {
            e.printStackTrace(); // prints exception if any occurs
        }
        FileReader fr = new FileReader("Practical_5.txt"); // FileReader to read the data from the file
        BufferedReader br = new BufferedReader(fr); // BufferedReader to read the data from the file
        String Int_line;
        while ((Int_line = br.readLine()) != null) {
            String In_Value = Int_line;
            // Print the Integer
            System.out.println(In_Value);
        }
        br.close();
        sc.close();
    }
}
