package Esercizio_call;

public class Call {
    @SuppressWarnings("unused")
    private String sender, receiver;
    private int start, stop;

    public Call(String sender, String receiver, int start, int stop){
        this.sender=sender;
        this.receiver=receiver;
        this.start=start;
        this.stop=stop;
    }

    public int getDuration(){
        return this.stop-this.start;
    }
}
