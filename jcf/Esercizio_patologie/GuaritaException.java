package Esercizio_patologie;

public class GuaritaException extends Exception{
    public GuaritaException(String nome){
        super("Patologia "+nome+" guarita");
    }
}