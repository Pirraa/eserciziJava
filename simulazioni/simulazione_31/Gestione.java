package simulazioni.simulazione_31;
import java.util.*;
import java.io.*;

public class Gestione 
{
    public static void main(String args[])
    {
        List<Veicolo> veicoli = new ArrayList<Veicolo>();
        List<Cliente> clienti = new ArrayList<Cliente>();
        //si possono anche creare due mappe differenti codice-costo e codice-targa
        Map<Integer,Veicolo> map=new HashMap<>();
        int noleggiTarga=0;

        try(Scanner sc=new Scanner(new File("veicoli.txt")))
        {
            sc.useLocale(Locale.ENGLISH);
            while(sc.hasNext())
            {
                int codice=sc.nextInt();
                String tipo=sc.next();//stringhe sula stessa rihga uso next
                String targa=sc.next();
                sc.nextLine();//vado alla riga sotto
                String modello=sc.nextLine();//stringa su riga diversa uso nextline
                String marca=sc.nextLine();
                if(tipo.equals("auto"))
                {
                    double bagagliaio=sc.nextDouble();
                    int cilindrata=sc.nextInt();
                    sc.nextLine();
                    String categoria=sc.nextLine();
                    double costo=sc.nextDouble();
                    Auto a=new Auto(codice,targa,modello,marca,costo,bagagliaio,cilindrata,categoria);
                    veicoli.add(a);
                    map.put(codice, a);
                }else{
                    boolean rimorchio=sc.nextBoolean();
                    int posti=sc.nextInt();
                    boolean carico=sc.nextBoolean();
                    double costo=sc.nextDouble();
                    Furgone f=new Furgone(codice,targa,modello,marca,costo,rimorchio,posti,carico);
                    veicoli.add(f);
                    map.put(codice, f);
                }
            }
            sc.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }catch(Exception e)
        {
            System.out.println(e);
        }

        
        for(Veicolo c : veicoli)
            System.out.println(c);

            try (Scanner sc = new Scanner(new File("clienti.txt"))) {
                while (sc.hasNextLine()) 
                {
                    // Legge il nome del cliente
                    String nome = sc.nextLine();
                    Cliente c = new Cliente(nome);
                    clienti.add(c);
                    // Legge i noleggi per il cliente attuale
                    while (sc.hasNextLine()) 
                    {
                        String line = sc.nextLine();
    
                        // Se si trova una riga vuota o un nuovo nome di cliente, esce dal ciclo interno
                        if (line.isEmpty()) {
                                break;
                        }
    
                        // Legge il codice e i giorni
                        Scanner lineScanner = new Scanner(line);
                        int codice = lineScanner.nextInt();
                        int giorni = lineScanner.nextInt();
                        lineScanner.close();
                        // Crea un nuovo noleggio e lo aggiunge al cliente
                        Noleggio n = new Noleggio(codice, giorni);
                        c.aggiungiNoleggio(n);
    
                        // Calcola il costo del noleggio
                        //posso anche mettere il costo nela classe noleggio e passarlo al costruttore quando lo creo qui sopra
                        //per ottenerlo uso la mappa fra il codice e il veicolo
                        //se metto il costo dentro noleggio calcolo lì il costo moltiplicando con i giorni e lo confronto con il costo massimo sempre nella classe
                        //faccio queste operazioni in un metodo della classe noleggio getcostomax
                        double costo = map.get(codice).getCosto() * giorni;
                        if (costo > c.getCostoMax()) {
                            c.setCostoMax(costo);
                        }
                        lineScanner.close();
                    }
                }
                sc.close();
            } catch (IOException e) {
                System.out.println(e);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        for (Cliente c: clienti){
            System.out.println(c);
        }

        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Inserisci la targa del veicolo da cercare"); 
            String targa=sc.next();
            //per evitare questo ciclo dovevo creare map fra targa e noleggi (stringa a int)
            //ogni volta che leggo un codice veicolo nel file clienti o aggiorno il numero noleggi se la targa c'è già nella mappa
            //oppure inserisco nuova coppia nella mappa con noleggi pari a 1
            //al posto dei ciclo quindi metterei int n=targaNoleggi.get(targa);
            for(Cliente c : clienti){
                for (Noleggio n : c.noleggi)
                    if (map.get(n.getVeicolo()).getTarga().equals(targa)) {
                        noleggiTarga++;
                    }
            }
            sc.close();
            System.out.println("Numero noleggi veicolo con targa"+targa +": "+noleggiTarga); 
        }catch(Exception e){
            System.out.println(e);
        }
        
        
    }
}
