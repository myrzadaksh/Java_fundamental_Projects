public class Perceptron {
    private int n;
    private double[] weights;

    public Perceptron(int n) {
        this.n = n;
        this.weights = new double[n];
    }

    public int numberOfInputs() {
        return n;
    }

    public double weightedSum(double[] x) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += weights[i] * x[i];
        }
        return sum;
    }

    public int predict(double[] x) {
        return weightedSum(x) >= 0 ? 1 : -1;
    }

    public void train(double[] x, int label) {
        int prediction = predict(x);
        if (prediction != label) {
            for (int i = 0; i < n; i++) {
                weights[i] += label * x[i];
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < n; i++) {
            sb.append(weights[i]);
            if (i < n - 1) sb.append(", ");
        }
        sb.append(")");
        return sb.toString();
    }

    public static void main(String[] args) {
        Perceptron perceptron = new Perceptron(3);
        System.out.println(perceptron);

        double[] training1 = { 5.0, -4.0, 3.0 };
        double[] training2 = { 2.0, 3.0, -2.0 };
        double[] training3 = { 4.0, 3.0, 2.0 };
        double[] training4 = { -6.0, -5.0, 7.0 };

        perceptron.train(training1, 1);
        System.out.println(perceptron);
        perceptron.train(training2, -1);
        System.out.println(perceptron);
        perceptron.train(training3, 1);
        System.out.println(perceptron);
        perceptron.train(training4, -1);
        System.out.println(perceptron);
    }
}


