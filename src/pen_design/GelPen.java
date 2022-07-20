package pen_design;

import pen_design.strategies.writestrategies.WriteBehaviour;
import pen_design.strategies.writestrategies.WriteSmoothBehaviour;

public class GelPen extends Pen implements RefillPen {

    private Refill refill;
    private boolean canChangeRefill = false ;

    private GelPen(WriteBehaviour writeBehaviour) {
        super(PenType.GEL, writeBehaviour);
    }

    public static class Builder {

        private Refill refill;
        private boolean canChangeRefill = false ;

        public Builder setRefill(Refill refill) {
            this.refill = refill;
            return this;
        }

        public Builder canChangeRefill(boolean value) {
            this.canChangeRefill = value;
            return this;
        }

        public GelPen build() {
            GelPen gelPen = new GelPen(new WriteSmoothBehaviour());
            gelPen.canChangeRefill = this.canChangeRefill;
            gelPen.refill = this.refill;
            return gelPen;
        }

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
