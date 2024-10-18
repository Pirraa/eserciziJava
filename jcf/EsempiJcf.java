
import java.util.*;

public class EsempiJcf
{
    @SuppressWarnings({ "rawtypes", "unchecked", "removal" })
    public static void main(String args[])
    {
        List list = new ArrayList();
        list.add(21); // OK da Java 1.5 in poi
        @SuppressWarnings("unused")
        int i = (Integer) list.get(0);

        Integer x = Integer.valueOf(23);
        Integer y = Integer.valueOf(4);
        @SuppressWarnings("unused")
        Integer z = x + y; // OK da Java 1.5 in poi

        Set s = new HashSet();
        for (int j=0; j<args.length; j++)
            if (!s.add(args[j]))
                System.out.println("Parola duplicata: " + args[j]);
        System.out.println(s.size() + " parole distinte: "+s);

        for (Iterator<String> it = s.iterator(); it.hasNext(); ) {
            System.out.print(it.next() + " ");
        }

        for (Object o : s) {
            System.out.print(o + " "); 
        }

        List list2 = new ArrayList();
        for (int k=0; k<args.length; k++) list2.add(args[k]);
            System.out.println(list2);
        swap(list2, 2, 3);
        System.out.println(list2);

        List list3 = new ArrayList();
        for (int j=0; j<args.length; j++) list3.add(args[j]);
            for( ListIterator j = list3.listIterator(list3.size()) ;
                j.hasPrevious() ; )
        System.out.print(j.previous()+" ");


        Map m = new HashMap();
        for (int k=0; k<args.length; k++) {
            Integer freq = (Integer) m.get(args[k]);
            m.put(args[k], (freq==null ? new Integer(1) :
            new Integer(freq.intValue() + 1)));
        }
        System.out.print(m.size() + " parole distinte: ");
        System.out.println(m);


        Persona elencoPersone[] = {
            new Persona("Eugenio", "Bennato"),
            new Persona("Roberto", "Benigni"),
            new Persona("Edoardo", "Bennato"),
            new Persona("Bruno", "Vespa")
        };
        List list4 = Arrays.asList(elencoPersone);
        Collections.sort(list4);
        System.out.println(list4);

    } 
    
    @SuppressWarnings("unchecked")
    static void swap(@SuppressWarnings("rawtypes") List a, int i, int j) {
        Object tmp = a.get(i);
        a.set(i, a.get(j)); a.set(j, tmp);
    }

        
}


@SuppressWarnings("rawtypes")
class Persona implements Comparable 
{
    private String nome, cognome;
    public Persona(String nome, String cognome) 
    {
        this.nome = nome; this.cognome = cognome;
    }
    public String nome() {return nome;}
    public String cognome() {return cognome;}
    public String toString() {return nome + " " + cognome;}
    public int compareTo(Object x) 
    {
        Persona p = (Persona) x;
        int confrontoCognomi = cognome.compareTo(p.cognome);
        return (confrontoCognomi!=0 ? confrontoCognomi :
        nome.compareTo(p.nome));
    }
}