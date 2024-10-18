package Esercizio_call;

import java.io.*;
import java.util.*;


public class Prova {
    public static void main(String[] args){
        try{
            List<Call> callList=new ArrayList<Call>();
            BufferedReader br=new BufferedReader(new FileReader("data.txt"));
            String line=br.readLine();
            while(line!=null){
                String[] items=line.split(";");
                int start=Integer.parseInt(items[2]);
                int stop=Integer.parseInt(items[3]);
                Call c = new Call(items[0], items[1], start, stop);
                if(c.getDuration()>55000)
                    callList.add(c);
                line=br.readLine();
            }
            br.close();
            
            System.out.println("Totale: "+callList.size()+" chiamate lunghe");
        }
        catch(Exception e){
            System.err.println(e);
        }
    }
}
