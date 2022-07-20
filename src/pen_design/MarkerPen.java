package pen_design;

import pen_design.strategies.writestrategies.WriteBehaviour;

public class MarkerPen extends Pen{

    public MarkerPen(WriteBehaviour writeBehaviour) {
        super(PenType.MARKER, writeBehaviour);
    }

    @Override
    public void write() {

    }

    @Override
    public void getColor() {

    }
}
