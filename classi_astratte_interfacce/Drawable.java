public interface Drawable
{
    public void setColor(int c);
    public void setPosition(double x, double y);
    public void draw();
}

class DrawableRectangle
extends Rectangle implements Drawable
{
    protected int c;
    protected double x, y;
    public DrawableRectangle(double w, double h)
    { super(w,h); }
    public void setColor(int c) { this.c = c; }
    public void setPosition(double x, double y)
    { this.x = x; this.y = y; }
    public void draw()
    { System.out.println("Rettangolo, posizione"+x+" "+y + "+ colore "+c);}

}

class DrawableCircle
extends Circle implements Drawable
{
    protected int c;
    protected double x, y;
    public DrawableCircle(double r)
    { super(r); }
    public void setColor(int c) { this.c = c; }
    public void setPosition(double x, double y)
    { this.x = x; this.y = y; }
    public void draw()
    { System.out.println("Cerchio, posizione"+x +" " +y+" colore "+c);}
}

class DrawableText implements Drawable
{
    protected int c;
    protected double x, y;
    protected String s;
    public DrawableText(String s) { this.s = s; }
    public void setColor(int c) { this.c = c; }
    public void setPosition(double x, double y)
    { this.x = x; this.y = y; }
    public void draw()
    { System.out.println("Testo, posizione"+x +" " +y+" colore "+c);}
}