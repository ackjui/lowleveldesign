package pen_design;

public class GelPen extends Pen implements RefillPen{


    public GelPen(PenType penType) {
        super(PenType.GEL );
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
