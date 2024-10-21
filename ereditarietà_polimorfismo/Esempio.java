public class Esempio 
{
    
    public static void main(String[] args)
    {
        int n;
        Counter2 c1;
        c1 = new BiCounter(); // Era c1 = new Counter() ma per polimorfismo posso fare anche questo assegnamento
        for (int i=0;i<150;i++)
        c1.inc();
        n = c1.getValue();
        System.out.println("Valore: "+n);


        c1 = new CentoCounter();// Era c1=new Counter()
        for (int i=0;i<150;i++)
            c1.inc(); //per polimorfismo richiama il metodo di centocounter e non di counter
        n = c1.getValue();
        System.out.println("Valore: "+n);


        Persona p=new Persona("Mario", "Rossi");
        Studente s=new Studente("Luca", "Bianchi", 12345);
        ((Studente) p).print(); // stampa nome ed età
        s.print(); // stampa nome, età, matricola
        p=s; // Ok, per il subtyping
        ((Studente) p).print(); // stampa nome, età, matricola perchè il tipo di istanza (non quello statico che è persona) è studente
    }
}
