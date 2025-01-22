class MultiPerceptron {
    private int m;
    private int n;
    private Perceptron[] perceptrons;

    public MultiPerceptron(int m, int n) {
        this.m = m;
        this.n = n;
        this.perceptrons = new Perceptron[m];
        for (int i = 0; i < m; i++) {
            perceptrons[i] = new Perceptron(n);
        }
    }

    public int numberOfClasses() {
        return m;
    }

    public int numberOfInputs() {
        return n;
    }

    public int predictMulti(double[] x) {
        double maxSum = Double.NEGATIVE_INFINITY;
        int bestClass = -1;
        for (int i = 0; i < m; i++) {
            double sum = perceptrons[i].weightedSum(x);
            if (sum > maxSum) {
                maxSum = sum;
                bestClass = i;
            }
        }
        return bestClass;
    }

    public void trainMulti(double[] x, int label) {
        for (int i = 0; i < m; i++) {
            if (i == label) {
                perceptrons[i].train(x, 1);
            }
            else {
                perceptrons[i].train(x, -1);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < m; i++) {
            sb.append(perceptrons[i].toString());
            if (i < m - 1) sb.append(", ");
        }
        sb.append(")");
        return sb.toString();
    }

    public static void main(String[] args) {
        MultiPerceptron multiPerceptron = new MultiPerceptron(2, 3);
        System.out.println(multiPerceptron);

        double[] training1 = { 5.0, -4.0, 3.0 };
        double[] training2 = { 2.0, 3.0, -2.0 };
        double[] training3 = { 4.0, 3.0, 2.0 };
        double[] training4 = { -6.0, -5.0, 7.0 };

        multiPerceptron.trainMulti(training1, 1);
        System.out.println(multiPerceptron);
        multiPerceptron.trainMulti(training2, 0);
        System.out.println(multiPerceptron);
        multiPerceptron.trainMulti(training3, 1);
        System.out.println(multiPerceptron);
        multiPerceptron.trainMulti(training4, 0);
        System.out.println(multiPerceptron);
    }
}
