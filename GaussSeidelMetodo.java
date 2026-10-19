package Ecuaciones_lineales.Gauss_Seidel;

import static Ecuaciones_lineales.Jacobi.MetodoJacobi.calcularError;

public class GaussSeidelMetodo {
    public static double[] gaussSeidel(double[][] A, double[] b, double[] xInicial, double tol, int maxIter) {
        int n = xInicial.length;
        double[] x = xInicial.clone();

        for (int iter = 0; iter < maxIter; iter++) {
            double[] xAnt = x.clone();
            for (int i = 0; i < n; i++) {
                double suma = b[i];
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        suma -= A[i][j] * x[j]; // ✅ Línea completada
                    }
                }
                x[i] = suma / A[i][i]; // ✅ Línea completada
            }
            if (calcularError(xAnt, x) < tol) return x; // ✅ Línea completada
        }
        return x;
    }
}

