package example1.solution_no_peeking.starter;

class RoundHole {
    private int radius;
    public RoundHole( int r ) {
        radius = r;
        System.out.println( "RoundHole for "+radius+": max SquarePeg is " + (radius/2) * Math.sqrt(2) );
    }

    public void putIn(SquarePeg peg){
        if (this.radius < peg.getRadius()){
            System.out.println("WILL NOT FIT: "+this.radius+ " < "+peg.getRadius());
        }
        else {
            System.out.println("Fits great");
        }
    }

    public int getRadius() { return radius; }


}
