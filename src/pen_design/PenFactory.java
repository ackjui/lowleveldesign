package pen_design;

public class PenFactory {

        public static GelPen.Builder createGelPen() {
                return new GelPen.Builder();
        }
}
