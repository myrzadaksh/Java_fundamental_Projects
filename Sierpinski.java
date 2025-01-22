public class Sierpinski {
    public static void filledTriangle(double x, double y, double length) {
        double x0 = x - length / 2;
        double y0 = y + (length * Math.sqrt(3)) / 2;
        double x1 = x + length / 2;
        double y1 = y + (length * Math.sqrt(3)) / 2;
        double[] xcoor = { x, x0, x1 };
        double[] ycoor = { y, y0, y1 };
        StdDraw.filledPolygon(xcoor, ycoor);
    }

    public static void sierpinski(int n, double x, double y, double length) {
        if (n == 0) return;
        filledTriangle(x, y, length);
        sierpinski(n - 1, x, (y + (length * Math.sqrt(3)) / 2), length / 2);
        sierpinski(n - 1, x - length / 2, y, length / 2);
        sierpinski(n - 1, x + length / 2, y, length / 2);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setScale(-1, 1);
        sierpinski(n, 0, 0, 0.5);
    }
}




