package example1.solution_no_peeking.starter;

public class Main {
    //client ----> round hole
    //client ----> adapter -------> round hole
    public static void main( String[] args ) {
        RoundHole rh = new RoundHole( 5 ); //=> round hole 是adaptee
        SquarePeg sp;
        for (int i=6; i < 10; i++) {
            sp= new SquarePeg(i);
            //Conversion
            //reducing size of square peg to fit into round hole

            double amount = sp.getWidth() - (rh.getRadius()/2) * Math.sqrt(2);
            System.out.println( "reducing SquarePeg " + sp.getWidth() + " by " + ((amount < 0) ? 0 : amount) + " amount" );
            if (amount > 0) {
                sp.setWidth( sp.getWidth() - amount );
                System.out.println( "   width is now " + sp.getWidth() );
            }
            rh.putIn(sp);
        }
    }
}
