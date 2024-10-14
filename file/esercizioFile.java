import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class esercizioFile
{
    public static void main(String[] args) 
    {
        if(args.length<1){
            System.out.println("Inserire il nome del file");
            System.exit(1);
        }
        String file=args[0];
        String leggi=" ";
        try{
            Scanner in = new Scanner( System.in );;
            PrintWriter outFile;
            FileWriter fw = new FileWriter(file);
            outFile = new PrintWriter(fw);
            System.out.println("Inserisci cosa scrivere nel file: ");
            while(!leggi.isEmpty()){
                leggi = in.nextLine();
                outFile.println(leggi);
            }
            in.close();
            outFile.close();
        }catch(FileNotFoundException e){
            System.out.println("File " + file + " not found.");
        }catch(IOException e){
            System.out.println(e);
        }

        try{
            FileReader fr = new FileReader(file);
            BufferedReader inFile = new BufferedReader(fr);
            leggi = inFile.readLine();
            while(leggi!=null){
                System.out.println(leggi);
                leggi = inFile.readLine();
            }
            inFile.close();
        }catch(FileNotFoundException e){
            System.out.println("File " + file + " not found.");
        }catch(IOException e){
            System.out.println(e);
        }
        
    }
}
