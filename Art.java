public class Art {
    public static void recursiveFunction(double x, double y, double size, double ang,
                                         int n) {
        if (n == 0) return;
        double newx = x + size * Math.cos(ang);
        double newy = y + size * Math.sin(ang);
        StdDraw.line(x, y, newx, newy);
        double newLength = size * 0.7;
        recursiveFunction(newx, newy, newLength, ang + Math.PI / 6, n - 1);
        recursiveFunction(newx, newy, newLength, ang - Math.PI / 6, n - 1);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int part = 2;
        StdDraw.setScale(-1.0, 1.0);
        StdDraw.setPenRadius(0.005);
        recursiveFunction(0.0, -0.8, 0.3, Math.PI / part, n);
    }
}


