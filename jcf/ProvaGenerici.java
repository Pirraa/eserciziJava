
import java.util.ArrayList;
import java.util.List;

public class ProvaGenerici
{
    public static void main(String[] args)
    {
        MyStack<Integer> stack = new MyStack<Integer>();
        stack.push(1).push(2).push(3);
        while (!stack.isEmpty())
            System.out.println(stack.pop());

        MyStack<Integer> stack1 = new MyStack<Integer>();
        stack1.push(18).push(22).push(34);
        MyStack<Double> stack2 = new MyStack<Double>();
        stack2.push(1.8).push(22.0).push(0.34);
        //stack2.push(18).push(22.0F).push(0.34);//controllo di tipo non mi consente di farlo
        stack1.push(18).push(22).push(34);
        stack2.push(1.8).push(22.0).push(0.34);
        //stack2.push(18).push(22.0F).push(0.34);
    }
    
    
}
   
class MyStack<T> 
{
    private List<T> storage;
    public MyStack(){ storage = new ArrayList<T>(); }
    public MyStack<T> push(T elem)
    {
        storage.add(elem); return this; // CASCADING
    }
    public T pop(){ return storage.remove(storage.size()-1);}
    public boolean isEmpty() { return storage.isEmpty(); }
}

