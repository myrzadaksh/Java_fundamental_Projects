import java.awt.Color;

public class Transform2D {
    public static double[] copy(double[] array) {
        double[] arrayxy = new double[array.length];
        for (int i = 0; i < arrayxy.length; i++) {
            arrayxy[i] = array[i];
        }
        return arrayxy;
    }

    public static void scale(double[] x, double[] y, double alpha) {
        double[] arrayscaleCX = new double[x.length];
        double[] arrayscaleCY = new double[y.length];
        for (int i = 0; i < arrayscaleCX.length; i++) {
            arrayscaleCX[i] = x[i] * alpha;
            arrayscaleCY[i] = y[i] * alpha;
        }
        StdDraw.setPenColor(Color.blue);
        StdDraw.polygon(arrayscaleCX, arrayscaleCY);
    }

    public static void translate(double[] x, double[] y, double dx, double dy) {
        double[] arraytranslateX = new double[x.length];
        double[] arraytranslateY = new double[y.length];
        for (int i = 0; i < arraytranslateX.length; i++) {
            arraytranslateX[i] = x[i] + dx;
            arraytranslateY[i] = y[i] + dy;
        }
        StdDraw.setPenColor(Color.blue);
        StdDraw.polygon(arraytranslateX, arraytranslateY);
    }

    public static void rotate(double[] x, double[] y, double theta) {
        double[] newx = new double[x.length];
        double[] newy = new double[y.length];
        double toRadian = Math.toRadians(theta);
        for (int i = 0; i < newx.length; i++) {
            newx[i] = x[i] * Math.cos(toRadian) - y[i] * Math.sin(toRadian);
            newy[i] = y[i] * Math.cos(toRadian) + x[i] * Math.sin(toRadian);
        }
        StdDraw.setPenColor(Color.blue);
        StdDraw.polygon(newx, newy);
    }

    public static void main(String[] args) {
        StdDraw.setScale(-5, 5);
        double[] x = { 0, 1, 1, 0 };
        double[] y = { 0, 0, 2, 1 };
        StdDraw.setPenColor(Color.RED);
        StdDraw.polygon(x, y);
        double[] cx = copy(x);
        double[] cy = copy(y);
        // scale(cx, cy, 2.0);
        // translate(cx, cy, 2.0, 1.0);
        rotate(cx, cy, -45.0);
    }
}
