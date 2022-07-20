package pen_design;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Pen> pens = new ArrayList<>();

        for (Pen pen : pens) {
                if (PenType.GEL.equals(pen.getPenType())) {
                    GelPen reynoldsTrimaxGelPen  = PenFactory.createGelPen()
                            .canChangeRefill(true)
                            .setRefill(new Refill())
                            .build();

                    reynoldsTrimaxGelPen.setCompany("Reynolds");
                    reynoldsTrimaxGelPen.setPrice(20);
                    reynoldsTrimaxGelPen.setName("Trimax ");
                }
        }
    }
}
