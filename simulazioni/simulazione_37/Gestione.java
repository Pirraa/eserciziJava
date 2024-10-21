package simulazioni.simulazione_37;
import java.util.*;
import java.io.*;

public class Gestione 
{
    public static void main(String[] args) 
    {
        List<Campo> campi=new LinkedList<Campo>();
        List<Socio> soci=new LinkedList<Socio>();
        Map<Integer, Campo> codCampo=new HashMap<Integer,Campo>();

        try
        {
            //leggo a righe quindi uso buferedReader
            BufferedReader br=new BufferedReader(new FileReader("campi.txt"));
            String line=br.readLine();
            while(line!=null){
                //mi serve tokenizer per tokenizzare la riga, la prima ha tipo e codice
                StringTokenizer st= new StringTokenizer(line);//divide per spazio di default
                int codice=Integer.parseInt(st.nextToken());
                String tipo=st.nextToken();
                
                //le riga successiva ha solo il nome non mi serve tokenizer
                String name=br.readLine();

                //lunghezza e larghezza sulla stessa riga devo usare tokenizer
                st=new StringTokenizer(br.readLine());
                float larghezza=Float.parseFloat(st.nextToken());
                float lunghezza=Float.parseFloat(st.nextToken());

                if(tipo.equals("tennis"))
                {
                    //temperatura sulla stessa riga di lunghezza e larghezza
                    float Temperatura=Float.parseFloat(st.nextToken());
                    //terreno e costo sulle due righe successive
                    String terreno=br.readLine();
                    float costo=Float.parseFloat(br.readLine());
                    Tennis t= new Tennis(codice, name, larghezza, lunghezza, costo, Temperatura, terreno);
                    campi.add(t);
                    codCampo.put(codice,t);
                }else 
                {
                    float altezza=Float.parseFloat(st.nextToken());
                    Integer piano=Integer.parseInt(st.nextToken());
                    float costo=Float.parseFloat(st.nextToken());
                    Squash s=new Squash(codice, name, larghezza, lunghezza, costo, altezza, piano);
                    campi.add(s);
                    codCampo.put(codice,s);
                }
                line=br.readLine();
            }
            br.close();
        }
        catch(IOException e)
        {
            System.out.println("Errore lettura file");
        }catch(Exception e)
        {
            System.out.println("Errore generico");
        }

        System.out.println("sport, nome del campo, codice, larghezza, lunghezza, temperatura, terreno, altezza, piano, costo");
        for(Campo c : campi)
        {
            System.out.println(c);
        }

        try{
            BufferedReader br=new BufferedReader(new FileReader("soci.txt"));
            String line=br.readLine();
            
            while(line!=null)
            {
                int codice=Integer.parseInt(line);
                String nome=br.readLine();
                StringTokenizer st=new StringTokenizer(br.readLine());
                int età=Integer.parseInt(st.nextToken());
                int categoria=Integer.parseInt(st.nextToken());
                Socio s=new Socio(codice,nome,età,categoria);
                soci.add(s);
                line = br.readLine();
                st = new StringTokenizer(line);
        
                while (st.hasMoreTokens())
                {
                    int cod=Integer.parseInt(st.nextToken());
                    int ora=Integer.parseInt(st.nextToken());
                    Prenotazione pren= new Prenotazione(cod,ora);
                    s.addPrenotazione(pren);
                    codCampo.get(cod).addPrenotazione();
                }
                line = br.readLine();

            }
            br.close();
        } catch(IOException e)
        {
            System.out.println("Errore lettura file");
        }catch(Exception e)
        {
            System.out.println("Errore generico"+e.getMessage());
        }

        System.out.println("codice, nome e cognome, età, prenotazioni");
        for (Socio s : soci)
          System.out.println(s);

        //PUNTO 5: stampe dell'incasso di un campo
        int cod=Integer.parseInt(args[0]);

        System.out.println(codCampo.get(cod).incasso());
    }
}