package simulazioni.simulazione_35;
import java.io.*;
import java.util.*;

public class Gestione 
{
    public static void main(String args[])
    {
        List<Squadra> squadre = new ArrayList<Squadra>();
        List<Giocatore> giocatori = new ArrayList<Giocatore>();
        Map<Integer, Squadra> codice_squadra = new HashMap<Integer, Squadra>();
        Map<String,Integer> sport_partite_vinte = new HashMap<String,Integer>();
        Map<String,Integer> sport_num_squadre = new HashMap<String,Integer>();

        try
        {
            BufferedReader br=new BufferedReader(new FileReader("squadre.txt"));
            String line;
            line=br.readLine();

            while(line!=null)
            {
                StringTokenizer st=new StringTokenizer(line);
                int codice=Integer.parseInt(st.nextToken());
                String sport=st.nextToken();
                String nome=br.readLine();
                if(sport.equals("pallamano"))
                {
                    st=new StringTokenizer(br.readLine());
                    int partite_vinte=Integer.parseInt(st.nextToken());
                    int partite_perse=Integer.parseInt(st.nextToken());
                    double num_reti=Double.parseDouble(st.nextToken());
                    Pallamano p=new Pallamano(codice,nome,partite_vinte,partite_perse,num_reti);
                    squadre.add(p);
                    codice_squadra.put(codice,p);
                    if(sport_partite_vinte.get("pallamano")==null)
                    {
                        sport_partite_vinte.put("pallamano",partite_vinte);
                    }
                    else
                    {
                        sport_partite_vinte.put("pallamano",sport_partite_vinte.get("pallamano")+partite_vinte);
                    }

                    if(sport_num_squadre.get("pallamano")==null)
                    {
                        sport_num_squadre.put("pallamano",1);
                    }else{
                        sport_num_squadre.put("pallamano",sport_num_squadre.get("pallamano")+1);
                    }
                }
                else if(sport.equals("hockey"))
                {
                    st=new StringTokenizer(br.readLine());
                    int partite_vinte=Integer.parseInt(st.nextToken());
                    int partite_perse=Integer.parseInt(st.nextToken());
                    double num_goal=Double.parseDouble(st.nextToken());
                    double num_falli=Double.parseDouble(st.nextToken());
                    Hockej h=new Hockej(codice,nome,partite_vinte,partite_perse,num_goal,num_falli);
                    squadre.add(h);
                    codice_squadra.put(codice,h);
                    if(sport_partite_vinte.get("hockey")==null)
                    {
                        sport_partite_vinte.put("hockey",partite_vinte);
                    }
                    else
                    {
                        sport_partite_vinte.put("hockey",sport_partite_vinte.get("hockey")+partite_vinte);
                    }

                    if(sport_num_squadre.get("hockey")==null)
                    {
                        sport_num_squadre.put("hockey",1);
                    }else{
                        sport_num_squadre.put("hockey",sport_num_squadre.get("hockey")+1);
                    }
                }
                line=br.readLine();
                line=br.readLine();
            }
            br.close();
        }
        catch (IOException e)
        {
            System.out.println("Errore di I/O");
        }catch(Exception e)
        {
            System.out.println("Errore di lettura");
        }

        System.out.println("nome della squadra, codice, n. partite vinte, n. partite perse, n. medio di gol, n. medio di falli, n.\r\n" + //
                        "medio di reti, sport");
        for(Squadra s : squadre)
        {
            System.out.println(s);
        }

        try
        {
            BufferedReader br=new BufferedReader(new FileReader("giocatori.txt"));
            String line;
            line=br.readLine();

            while(line!=null)
            {
                int codice=Integer.parseInt(line);
                String cognome=br.readLine();
                String nome=br.readLine();
                
                StringTokenizer st=new StringTokenizer(br.readLine());
                int età=Integer.parseInt(st.nextToken());
                int numero_maglia=Integer.parseInt(st.nextToken());
                String ruolo=st.nextToken();
                
                boolean titolare=Boolean.parseBoolean(st.nextToken());
                Giocatore g=new Giocatore(cognome,codice,nome,età,numero_maglia,ruolo,titolare);
                giocatori.add(g);
                line=br.readLine();
            }
            br.close();
        }
        catch(Exception e)
        {
            System.out.println("Errore di I/O");
        }

        System.out.println("\n\nnome, cognome, età, numero di maglia, ruolo, titolare, nome squadra");
        for(Giocatore g : giocatori)
        {
            System.out.println(g+"\t"+codice_squadra.get(g.codice_squadra).getNome());
            //System.out.println(g+"\t");
        }

        //media partite vinte per sport
        double media_pallamano=(double)sport_partite_vinte.get("pallamano")/sport_num_squadre.get("pallamano");
        double media_hockey=(double)sport_partite_vinte.get("hockey")/sport_num_squadre.get("hockey");

        System.out.println("\n\nMedia partite vinte per sport");
        System.out.println("Pallamano: "+media_pallamano);
        System.out.println("Hockey: "+media_hockey);
    }
}
