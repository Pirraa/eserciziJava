public class Main {
    public static void main(String[] args){
        try{
            Esercizio1 oggetto=new Esercizio1(args);
        }
        catch(NumberFormatException e1){
            System.out.println("Format Exception 1: "+e1.getMessage()); // Messaggio di errore predefinito
        }
        catch(IllegalArgumentException e2){
            System.out.println("Format Exception 2: "+e2.getMessage()); // Messaggio di errore definito in Esercizio1
        }
    }   
}