package Ecuaciones_lineales;

import Ecuaciones_lineales.Definicion.Sistema;
import Ecuaciones_lineales.Jacobi.MetodoJacobi;
import Ecuaciones_lineales.Gauss_Seidel.GaussSeidelMetodo;

public class Main {
    public static void main(String[] args) {
        double[][] A = Sistema.matrizA();
        double[] b = Sistema.vectorB();
        double[] x0 = Sistema.vectorInicial();
        double tol = 0.0001;
        int maxIter = 100;

        double[] solJacobi = MetodoJacobi.jacobi(A, b, x0, tol, maxIter);
        double[] solGS = GaussSeidelMetodo.gaussSeidel(A, b, x0, tol, maxIter);

        System.out.println("Solución por Jacobi:");
        for (int i = 0; i < solJacobi.length; i++) {
            System.out.println("x" + (i+1) + " = " + solJacobi[i]);
        }

        System.out.println("\nSolución por Gauss-Seidel:");
        for (int i = 0; i < solGS.length; i++) {
            System.out.println("x" + (i+1) + " = " + solGS[i]);
        }
    }
}
