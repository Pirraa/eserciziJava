package simulazioni.simulazione_38;
import java.util.*;
import java.io.*;

public class Gestione 
{
    public static void main(String args[])
    {
        List<Veicoli> veicoli = new ArrayList<>();
        List<Cliente> clienti = new ArrayList<>();
        Map<Integer, Veicoli> veicoli_map = new HashMap<>();
        //se metto la lista di prenotazioni dentro al veicolo evito di creare questa map che collega il veicolo al costo totale dei suoi noleggi
        Map<Veicoli,Double> veicolo_noleggio =new HashMap<>();

        try
        {
            //BufferedReader br = new BufferedReader(new FileReader("veicoli.txt"));
            Scanner sc = new Scanner(new File("veicoli.txt"));
            // Imposta il locale per il formato americano (punto come separatore decimale)
            sc.useLocale(Locale.ENGLISH);

            //String line;
            //line=br.readLine();

            while(sc.hasNext())
            {
                //StringTokenizer stringTokenizer = new StringTokenizer(line);
               
                int codice = sc.nextInt();
                String sport = sc.next();
                sc.nextLine();
                String marca = sc.nextLine();
               

                if(sport.equals("roulotte"))
                {
                    //stringTokenizer = new StringTokenizer(br.readLine());
                    //sc.nextLine();
                    int peso = sc.nextInt();
                    double lunghezza = sc.nextDouble();
                    double larghezza = sc.nextDouble();
                    int posti_letto = sc.nextInt();
                    //stringTokenizer = new StringTokenizer(br.readLine());
                    sc.nextLine();
                    String veranda = sc.next();
                    double costo_giornaliero = sc.nextDouble();
                    veicoli.add(new Roulotte(codice, marca, 
                    lunghezza, larghezza, posti_letto, costo_giornaliero, peso, veranda));
                    veicoli_map.put(codice, new Roulotte(codice, marca, lunghezza, larghezza, posti_letto, costo_giornaliero, peso, veranda));
                }
                else if(sport.equals("caravan"))
                {
                    //stringTokenizer = new StringTokenizer(br.readLine());
                    double larghezza = sc.nextDouble();
                    double lunghezza = sc.nextDouble();
                    int potenza = sc.nextInt();
                    int posti_letto = sc.nextInt();
                    double costo_giornaliero = sc.nextDouble();
                    veicoli.add(new Caravan(codice, marca, lunghezza, larghezza, posti_letto, costo_giornaliero, potenza));
                    veicoli_map.put(codice, new Caravan(codice, marca, lunghezza, larghezza, posti_letto, costo_giornaliero, potenza));
                }
                sc.nextLine();
            }
            sc.close();
        }
        catch(IOException e)
        {
            System.out.println("Errore di I/O");
        }catch(Exception e)
        {
            System.out.println("Errore"+e.getMessage()+e.getCause());
        }

        System.out.println("tipo, codice, marca, larghezza, lunghezza, posti letto, peso, veranda, potenza, costo");
        for(Veicoli v: veicoli)
        {
            System.out.println(v);
        }

        try
        {
            BufferedReader br=new BufferedReader(new FileReader("clienti.txt"));
            String line=br.readLine();

            while(line!=null)
            {
                int codice=Integer.parseInt(line);
                String nome=br.readLine();
                String cognome=br.readLine();
                String indirizzo=br.readLine();
                Cliente c=new Cliente(codice, nome, cognome, indirizzo);
                clienti.add(c);

                //qui creo token della riga e valuto se ci sono ancora token per uscire
                //potevo anche fare solo readline e fare while con line !=null o da ""
                //quindi spostavo tokenizer all'inizio del while e lasciavo readline in fondo
                StringTokenizer st = new StringTokenizer(br.readLine());
                while(st.hasMoreTokens())
                {
                    int cod_veicolo=Integer.parseInt(st.nextToken());
                    int giorni=Integer.parseInt(st.nextToken());
                    Noleggio n=new Noleggio(cod_veicolo, giorni);
                    c.addNoleggio(n);
                    //recupero costo di quel noleggio con costo veicolo ottenuto dal veicolo nella mappa usando il codice come chiave, moltiplicato per i giorni
                    double costo=veicoli_map.get(cod_veicolo).getCosto()*giorni;
                    System.out.println("Costo: "+costo);

                    //se metto lista di prenotazioni nella classe veicolo non serve questo
                    if(veicolo_noleggio.get(veicoli_map.get(cod_veicolo))!=null)
                    {
                        veicolo_noleggio.put(veicoli_map.get(cod_veicolo), veicolo_noleggio.get(veicoli_map.get(cod_veicolo))+costo);
                    }else
                    {
                        veicolo_noleggio.put(veicoli_map.get(cod_veicolo), costo);
                    }
                    st = new StringTokenizer(br.readLine());
                }
                line=br.readLine();
            }
            br.close();
        }
        catch(Exception e)
        {
            System.out.println("Errore"+e.getMessage()+e.getCause());
        }

        System.out.println("codice, cognome, nome, indirizzo, prenotazioni");
        for(Cliente c: clienti)
        {
            System.out.println(c);
        }

        /*I programmi devono stampare l’incasso totale per ciascun veicolo, ottenuto calcolando
        sommando, per ogni noleggio, il costo del noleggio, a sua volta ottenuto moltiplicando il
        numero dei giorni per il costo giornaliero del veicolo. Il risultato va stampato in una tabella
        con questa intestazione
        codice incasso */

        //con lista di prenotazioni dentro veicolo sommo i giorni delle vaie prenotazioni
        //poi li moltiplico per il costo che è sempre dentro veicolo, questo dentro un metodo che mi calcola il totale
        System.out.println("codice, incasso");
        for(Veicoli v: veicolo_noleggio.keySet())
        {
            System.out.println(v.getCodice()+"\t"+veicolo_noleggio.get(v));
        }
    }
}
