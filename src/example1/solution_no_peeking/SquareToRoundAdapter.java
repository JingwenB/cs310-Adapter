package example1.solution_no_peeking;

public class SquareToRoundAdapter implements SquareToAnythingInterface {
    RoundHole rh;

    public SquareToRoundAdapter(int radius) {
        rh=new RoundHole(radius);
    }

    @Override
    public void putIn(SquarePeg sp) {
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
