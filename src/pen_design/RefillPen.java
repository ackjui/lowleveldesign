package pen_design;

public interface RefillPen {

    Refill getRefill();

    boolean canChangeRefill();

    void changeRefill(Refill newRefill);
}
