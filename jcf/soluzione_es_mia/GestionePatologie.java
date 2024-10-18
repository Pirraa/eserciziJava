package soluzione_es_mia;

public class GestionePatologie 
{
    public static void main(String[]args)
    {
        Patologia asma=new Patologia("asma",10);
        Patologia graminacee=new Patologia("graminacee",2);
        Paziente p1=new Paziente("Rossi");
        p1.aggiungiPatologia(asma);
        p1.aggiungiPatologia(graminacee);
        System.out.println(p1.toString());
        try{
            asma.aggrava();
        }catch(MoltoGraveException e){
            e.stampa(asma.getNome());
        }
        try{
            graminacee.attenua();
            graminacee.attenua();
            System.out.println(p1.toString());
        }catch(GuaritaException e){
            e.stampa(graminacee.getNome());
        }

    }
}
