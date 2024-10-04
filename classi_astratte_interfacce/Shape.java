public abstract class Shape
{
    public abstract double area();
    public abstract double perimeter();
}

class Circle extends Shape
{
    protected double r;
    public Circle(double r) { this.r = r; }
    public double area() { return Math.PI * r * r; }
    public double perimeter() { return 2 * r * Math.PI; }
    public double getRadius() { return r; }
}

class Rectangle extends Shape
{
    protected double w,h;
    public Rectangle(double w, double h)
    {this.w = w; this.h = h;}
    public double area() { return w * h; }
    public double perimeter() { return 2 * (w + h); }
    public double getWidth() { return w; }
    public double getHeight() { return h; }
}