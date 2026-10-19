# Métodos Iterativos - Jacobi y Gauss-Seidel

Proyecto en Java para resolver sistemas de ecuaciones lineales Ax = b.

## Sistema que resuelve

5x1 + x2 + x3 = 7
 x1 + 4x2 + x3 = 6
 x1 + 2x2 + 5x3 = 8

Matriz A = [[5,1,1],[1,4,1],[1,2,5]]
Vector b = [7,6,8]
Vector inicial x0 = [0,0,0]

## Archivos

- `Definicion/Sistema.java` - Define la matriz A, vector b y x0
- `Jacobi/MetodoJacobi.java` - Método de Jacobi
- `Gauss_Seidel/GaussSeidelMetodo.java` - Método de Gauss-Seidel
- `Main.java` - Ejecuta ambos métodos

## Como ejecutar

javac Ecuaciones_lineales/*.java Ecuaciones_lineales/*/*.java
java Ecuaciones_lineales.Main

## Resultado

Solución exacta: x1=1, x2=1, x3=1

El programa para cuando el error < 0.0001
Error = sqrt( (x1-xAnt1)^2 + (x2-xAnt2)^2 + (x3-xAnt3)^2 )

## Diferencia entre métodos

Jacobi usa: A[i][j] * xAnt[j] (valores de iteración anterior)
Gauss-Seidel usa: A[i][j] * x[j] (valores ya actualizados)

Gauss-Seidel converge más rápido.
