package simulazione_29;
import java.util.*;

import java.io.*;

public class Gestione 
{
    public static void main(String args[])
    {
        List<Dipendente> dipendenti = new ArrayList<>();
        List<Cliente> clienti = new ArrayList<>();
        Map<Integer, Dipendente> codDip = new HashMap<>();
        Map<Dipendente,Integer> dipServizi=new HashMap<>();

        try{
            BufferedReader br=new BufferedReader(new FileReader("dipendenti.txt"));
            String line=br.readLine();
            while(line!=null){
                
                //mi serve tokenizer per tokenizzare la riga, la prima ha tipo e codice
                StringTokenizer st= new StringTokenizer(line);//divide per spazio di default
                int codice=Integer.parseInt(st.nextToken());
                String tipo=st.nextToken();
                
                //le riga successiva ha solo il nome non mi serve tokenizer
                String name=br.readLine();

                if(tipo.equals("trainer"))
                {
                    st=new StringTokenizer(br.readLine());
                    //temperatura sulla stessa riga di lunghezza e larghezza
                    int ore=Integer.parseInt(st.nextToken());
                    double costo=Double.parseDouble(st.nextToken());
                    String specialita=br.readLine();
                    Trainer t= new Trainer(codice, name, costo, ore, specialita);
                    dipendenti.add(t);
                    codDip.put(codice,t);
                }else 
                {
                    st=new StringTokenizer(br.readLine());
                    int telefono=Integer.parseInt(st.nextToken());
                    boolean medico=Boolean.parseBoolean(st.nextToken());
                    int appuntamenti=Integer.parseInt(st.nextToken());
                    double costo=Double.parseDouble(st.nextToken());
                    Nutrizionista n=new Nutrizionista(codice, name, costo, telefono, medico, appuntamenti);
                    dipendenti.add(n);
                    codDip.put(codice,n);
                }
                line=br.readLine();
            }
            br.close();

        }catch(Exception e)
        {
            System.out.println(e);
        }

        for(Dipendente d : dipendenti)
        {
            System.out.println(d);
        }

        try{
            BufferedReader br=new BufferedReader(new FileReader("clienti.txt"));
            String line=br.readLine();
            while(line!=null)
            {
                int codice=Integer.parseInt(line);
                String nome=br.readLine();

                

                Cliente c=new Cliente(codice, nome);
                clienti.add(c);

                StringTokenizer st = new StringTokenizer(br.readLine());
                while (st.hasMoreTokens())
                {
                    int codice2=Integer.parseInt(st.nextToken());
                    double ore=Double.parseDouble(st.nextToken());
                    //ottengo costo come numero ore per costo del dipendente, ottenuto prendendo il dipendente dalla map che associa il dipendente al suo codice
                    double costo=codDip.get(codice2).getCosto()*ore; 
                    Servizio s=new Servizio(codice2, ore,costo);
                    c.addServizio(s);

                    Integer servizi=dipServizi.get(codDip.get(codice2));
                    if(servizi==null)
                    {
                        dipServizi.put(codDip.get(codice2),1);
                    }else{
                        dipServizi.put(codDip.get(codice2),servizi+1);
                    }
                    st = new StringTokenizer(br.readLine());
                }
                line=br.readLine();
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }

        for(Cliente c : clienti)
        {
            System.out.println(c);
        }

        //scorro la map per trovare dipendente con più ore di servizio
        //le entry sono le coppie chiave valore, getvalue mi restituisce il valore invece getkey la chiave
        int valoreMax=0;
        Dipendente dipendenteConValoreMax=null;
        for (Map.Entry<Dipendente, Integer> entry : dipServizi.entrySet()) {
            if (entry.getValue() > valoreMax) {
                valoreMax = entry.getValue();
                dipendenteConValoreMax = entry.getKey();
            }
        }

        // Stampa il dipendente con il valore massimo
        if (dipendenteConValoreMax != null) {
            System.out.println("Il dipendente con il valore massimo è: " + dipendenteConValoreMax.toString() + " con valore: " + valoreMax);
        } else {
            System.out.println("La mappa è vuota.");
        }
        
    }
}
