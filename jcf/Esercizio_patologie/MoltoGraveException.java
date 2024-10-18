package Esercizio_patologie;

public class MoltoGraveException extends Exception{
    public MoltoGraveException(String nome){
        super("Patologia "+nome+" troppo grave");
    }
}
