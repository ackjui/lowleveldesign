package pen_design;

import pen_design.strategies.writestrategies.WriteBehaviour;

public class BallPen extends Pen implements RefillPen {

    public BallPen(WriteBehaviour writeBehaviour) {
        super(PenType.BALL, writeBehaviour);
    }

    @Override
    public void write() {

    }

    @Override
    public void getColor() {

    }

    @Override
    public Refill getRefill() {
        return null;
    }

    @Override
    public boolean canChangeRefill() {
        return false;
    }

    @Override
    public void changeRefill(Refill newRefill) {

    }
}
