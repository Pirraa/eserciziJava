package jcf.soluzione_es_mia;

import java.util.ArrayList;

public class Paziente 
{
    String cognome;
    ArrayList<Patologia> patologie;

    public Paziente(String cognome) 
    {
        this.cognome = cognome;
        patologie = new ArrayList<Patologia>();
    }

    public String getCognome() 
    {
        return cognome;
    }

    public void aggiungiPatologia(Patologia p) 
    {
        if(!patologie.contains(p))
            patologie.add(p);
    }

    public boolean rimuoviPatologia(Patologia p) 
    {
        if(patologie.contains(p))
        {
            patologie.remove(p);
            return true;
        }
        return false;
    }

    public String toString() 
    {
        String s = "Paziente: "+cognome+"\n";
        for(Patologia p : patologie)
            s += p.toString()+"\n";
        return s;
    }
}
