import java.util.*;

public class Esercizio1 {
    public Esercizio1(String[] args) {
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args){
        List<Node> list = Arrays.asList(new Node("c"), new Node("b"), new Node ("d"), new Node("a"));
        
        Collections.sort(list, (a,b) -> a.name().compareTo(b.name()));
        System.out.println(list);
    }
}
