package pen_design;

public class BallPen extends Pen implements RefillPen {

    public BallPen(PenType penType) {
        super(PenType.BALL);
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
