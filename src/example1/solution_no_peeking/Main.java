package example1.solution_no_peeking;


public class Main {
    //client ----> round hole
    //client ----> adapter -------> round hole
    public static void main( String[] args ) {
        SquareToAnythingInterface holeAdapter = new SquareToRoundAdapter( 5 );
//        RoundHole rh = new RoundHole( 5 ); //=> round hole 是adaptee
        SquarePeg sp;
        for (int i=6; i < 10; i++) {
            sp= new SquarePeg(i);
            holeAdapter.putIn(sp);
        }
    }
}

