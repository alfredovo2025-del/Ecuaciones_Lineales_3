package Ecuaciones_lineales.Definicion;

public class Sistema {
    public static double[][] matrizA() {
        return new double[][]{
                {5, 1, 1},
                {1, 4, 1},
                {1, 2, 5}
        };
    }

    public static double[] vectorB() {
        return new double[]{7, 6, 8};
    }

    public static double[] vectorInicial() {
        return new double[]{0, 0, 0};
    }
}
