package Ecuaciones_lineales.Jacobi;

public class MetodoJacobi {

    public static double[] jacobi(double[][] A, double[] b, double[] xInicial, double tol, int maxIter) {
        int n = A.length;
        double[] x = xInicial.clone();
        double[] xAnt = new double[n];

        for (int iter = 0; iter < maxIter; iter++) {
            xAnt = x.clone();
            for (int i = 0; i < n; i++) {
                double suma = b[i];
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        suma -= A[i][j] * xAnt[j];
                    }
                }
                x[i] = suma / A[i][i];
            }
            if (calcularError(xAnt, x) < tol) return x;
        }
        return x;
    }

    public static double calcularError(double[] xAnt, double[] x) {
        double suma = 0;
        for (int i = 0; i < x.length; i++) {
            suma += Math.pow(x[i] - xAnt[i], 2);
        }
        return Math.sqrt(suma);
    }
}
