package simulazioni.simulazione_16_01_2022;
import java.util.*;
import java.io.*;
//11:14
public class Gestione 
{
    public static void main(String args[])
    {
        List<Articolo> articoli=new ArrayList<>();
        List<Negozio> negozi=new ArrayList<>();
        Map<Integer,Articolo> cod_articolo=new HashMap<>();
        Map<Integer,Negozio> cod_negozio=new HashMap<>();
        try
        {
            BufferedReader br=new BufferedReader(new FileReader("articoli.txt"));
            String line=br.readLine();

            while(line!=null)
            {
                StringTokenizer tok=new StringTokenizer(line);
                int codice=Integer.parseInt(tok.nextToken());
                String tipo=tok.nextToken();
                String marca=br.readLine();
               

                if(tipo.equals("giacca-a-vento"))
                {
                    String s=br.readLine();
                    char taglia=s.charAt(0);
                    String modello=br.readLine();
                    tok=new StringTokenizer(br.readLine());
                    float costo=Float.parseFloat(tok.nextToken());
                    int num_tasche=Integer.parseInt(tok.nextToken());
                    int sconto=Integer.parseInt(tok.nextToken());
                    Giacca g=new Giacca(codice, marca, taglia, modello, num_tasche, sconto,costo);
                    articoli.add(g);
                    cod_articolo.put(codice,g);
                    
                }else{
                    tok=new StringTokenizer(br.readLine());
                    String s=tok.nextToken();
                    char taglia=s.charAt(0);
                    int peso=Integer.parseInt(tok.nextToken());
                    String modello=br.readLine();
                    tok=new StringTokenizer(br.readLine());
                    float costo=Float.parseFloat(tok.nextToken());
                    int sconto=Integer.parseInt(tok.nextToken());
                    Piumino p=new Piumino(codice, marca, taglia, modello, peso, sconto,costo);
                    articoli.add(p);
                    cod_articolo.put(codice,p);
                }
                line=br.readLine();
            }
            br.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        System.out.println("tipo, codice, marca, modello, taglia, tasche, peso, costo,sconto");
        for(Articolo a : articoli)
            System.out.println(a);

        try
        {
            BufferedReader br=new BufferedReader(new FileReader("negozi.txt"));
            String line=br.readLine();

            while(line!=null)
            {
                int codice=Integer.parseInt(line);
                String nome=br.readLine();
                String indirizzo=br.readLine();
                Negozio n=new Negozio(nome,indirizzo,codice);
                cod_negozio.put(codice,n);
                
                negozi.add(n);
                line=br.readLine();

                StringTokenizer tok=new StringTokenizer(line);
                while(tok.hasMoreTokens())
                {
                    int codice_articolo=Integer.parseInt(tok.nextToken());
                 
                    int quantità=Integer.parseInt(tok.nextToken());
                    
                    float costo=cod_articolo.get(codice_articolo).getCosto();
                   
                    Giacenza g=new Giacenza(codice_articolo, quantità,costo);
                    n.addGiacenza(g);
                }
                line=br.readLine();
            }
            //System.out.println(cod_negozio.entrySet());
            br.close();
        }
        catch(Exception e){
            System.out.println(e);
        }

        System.out.println("codice, nome, indirizzo, numero di articoli, magazzino");
        for(Negozio n : negozi)
            System.out.println(n);

        System.out.println("Leggi codice negozio");
        Scanner sc=new Scanner(System.in);
        int codice=Integer.parseInt(sc.nextLine());
        /*
         * I programmi devono leggere da tastiera il codice di un negozio e stampare il valore totale del
            magazzino (ottenuto moltiplicando il costo di ciascun articolo per la quantità e sommando il
            risultato per i vari articoli
         */
        
        Negozio n=cod_negozio.get(codice);
        
        if(n!=null)
        {
            System.out.println("costo totale negozio "+n+" "+n.costoTotale());
        }
        sc.close();
    }
}
