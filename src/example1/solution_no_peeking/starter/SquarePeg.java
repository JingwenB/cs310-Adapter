package example1.solution_no_peeking.starter;

class SquarePeg{
    protected double radius = 0;
    private double width;
    public SquarePeg( double w )       { setWidth(w); }
    public double getWidth()           { return width; }
    public void   setWidth( double w ) {
        width = w;
        this.radius = width * Math.sqrt(2);
    }
    public double getRadius() {return radius;}
}
