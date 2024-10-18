package Esercizio_patologie;

public class Patologia {
    private String nome;
    private int grave;

    public Patologia(String nome, int grave){
        this.nome=nome;
        this.grave=grave;
    }

    public String getNome(){
        return this.nome;
    }

    public int getGravità(){
        return this.grave;
    }

    public void aggrava() throws MoltoGraveException{
        if(this.grave<10)
            this.grave++;
        else
            throw new MoltoGraveException(this.nome);
    }

    public void attenua() throws GuaritaException{
        if(this.grave>1)
            this.grave--;
        else
            throw new GuaritaException(this.nome);
    }

    public boolean equals(Object o){
        Patologia p=(Patologia) o;
        boolean esito=p.getNome().equals(this.nome);
        return esito;
    }

    public String toString(){
        return this.nome+" con gravità "+this.grave+"\n";
    }
}
