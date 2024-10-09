import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;


public class Leggi 
{
    public static void Main(String args[]) throws IOException
    {
        FileReader fr = new FileReader("inventory.dat");//percorso relativo
        BufferedReader inFile = new BufferedReader(fr);
        inFile.readLine();

        Scanner sc=new Scanner(new File("inventory.dat"));
        sc.nextLine();

        inFile.close();
        sc.close();
    }
}
