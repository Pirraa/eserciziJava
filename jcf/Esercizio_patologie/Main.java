package Esercizio_patologie;

public class Main {
    public static void main(String[] args){
        Patologia p1=new Patologia("allergia graminacee", 2);
        Patologia p2=new Patologia("asma", 10);
        Paziente paz=new Paziente("Rossi");

        paz.aggiungiPatologia(p1);
        paz.aggiungiPatologia(p2);

        System.out.println(paz.toString());

        try{
            p2.aggrava();
        }
        catch(MoltoGraveException e){
            System.out.println(e.getMessage());
        }

        try{
            p1.attenua();
            p1.attenua();
        }
        catch(GuaritaException e){
            System.out.println(e.getMessage());
            paz.rimuoviPatologia(p1);
        }
    } 
}
