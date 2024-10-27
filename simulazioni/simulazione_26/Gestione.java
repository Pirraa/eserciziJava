package simulazioni.simulazione_26;
import java.util.*;

import java.io.*;

public class Gestione 
{
    public static void main(String args[])
    {
        List<Partecipante>partecipanti=new ArrayList<>();
        List<Conferenza>conferenze=new ArrayList<>();
        Map<Integer,Partecipante> codPartecipante=new HashMap<>();

        try
        {
            /*Scanner sc=new Scanner(new File("partecipanti.txt"));

            while(sc.hasNext())
            {
                int codice=sc.nextInt();
                String tipo=sc.next();
                sc.nextLine();
                String nome=sc.nextLine();
                String cognome=sc.nextLine();
                sc.nextLine();

                if(tipo.equals("studente"))
                {
                    String corso=sc.nextLine();
                    String università=sc.nextLine();
                    int anno=sc.nextInt();

                    Studente s=new Studente(codice, nome, cognome, corso, università, anno);
                    partecipanti.add(s);
                    codPartecipante.put(codice,s);
                }else{
                    String ente=sc.nextLine();
                    int dipendenti=sc.nextInt();
                    boolean accademico=sc.nextBoolean();
                    Regolare r=new Regolare(codice, nome, cognome, ente, accademico, dipendenti);
                    partecipanti.add(r);
                    codPartecipante.put(codice,r);
                }
                sc.nextLine();
                
            }*/
            BufferedReader rb=new BufferedReader(new FileReader("partecipanti.txt"));
            String line=rb.readLine();

            while(line!=null)
            {
                StringTokenizer st=new StringTokenizer(line);
                int codice=Integer.parseInt(st.nextToken());
                String tipo=st.nextToken();
                String nome=rb.readLine();
                String cognome=rb.readLine();
                

                if(tipo.equals("studente"))
                {
                    String corso=rb.readLine();
                    String università=rb.readLine();
                    line=rb.readLine();
                    int anno=Integer.parseInt(line);
                    Studente s=new Studente(codice, nome, cognome, corso, università, anno);
                    partecipanti.add(s);
                    codPartecipante.put(codice,s);
                }else{
                    String ente=rb.readLine();
                    line=rb.readLine();
                    st=new StringTokenizer(line);
                    int dipendenti=Integer.parseInt(st.nextToken());
                    boolean accademico=Boolean.parseBoolean(st.nextToken());
                    Regolare r=new Regolare(codice,nome,cognome,ente,accademico,dipendenti);
                    partecipanti.add(r);
                    codPartecipante.put(codice,r);
                }
                line=rb.readLine();
            }
            rb.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        System.out.println("tipo, codice, nome, cognome, corso di studi, università, anno di corso, ente di appartenenza, numero di dipendenti, accademico");
        for(Partecipante p : partecipanti)
            System.out.println(p);

        try
        {
            BufferedReader rb=new BufferedReader(new FileReader("conferenze.txt"));
            String line=rb.readLine();

            while(line!=null)
            {
                String nome=line;
                String luogo=rb.readLine();
                Conferenza f=new Conferenza(nome,luogo);
                conferenze.add(f);
                line=rb.readLine();
                while(!line.isEmpty())
                {
                    StringTokenizer st=new StringTokenizer(line);
                    int codice=Integer.parseInt(st.nextToken());
                    int spesa=Integer.parseInt(st.nextToken());
                    Partecipante p=codPartecipante.get(codice);
                    Partecipazione partecipazione=new Partecipazione(spesa,p);
                    f.aggiungiPartecipazione(partecipazione);
                    line=rb.readLine();
                }
                line=rb.readLine();
            }
            rb.close();
        }catch(Exception e){
            System.out.println(e);
        }

        System.out.println();
        /*
         * Il programma deve stampare a video, per ciascuna conferenza, il suo nome, 
         * il suo luogo e il totale delle spese di iscrizione, 
         * il numero di partecipanti e l’elenco dei partecipanti nella forma (cognome, spese di iscrizione).
         */
        System.out.println("elenco conferenze: ");
        for(Conferenza f: conferenze)
            System.out.println(f);

        /*
         * Il programma deve leggere da tastiera il codice di un partecipante e 
         * dire se è regolare o studente. Nel caso sia regolare, stampare il 
         * suo ente di appartenenza, nel caso sia studente, stampare la sua università
         */
        System.out.println("inserisci codice partecipante");
        Scanner sc=new Scanner(System.in);
        int codice=sc.nextInt();

        Partecipante p=codPartecipante.get(codice);
        if(p instanceof Regolare)
        {
            Regolare r=(Regolare)p;
            System.out.println(r.getente());
        }else{
            Studente r=(Studente)p;
            System.out.println(r.getUni());
        }
        sc.close();
        
    }
}
