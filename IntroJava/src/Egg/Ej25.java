/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y
muestre traspuesta.
 */
package Egg;

/**
 *
 * @author Pc
 */
public class Ej25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 99);
            }
        }
        System.out.println("Matriz");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j < 3) {
                    System.out.print(matriz[i][j] + " ");
                } else {
                    System.out.println(matriz[i][j]);
                }
            }
        }
        System.out.println("Matriz traspuesta");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j < 3) {
                    System.out.print(matriz[j][i] + " ");
                } else {
                    System.out.println(matriz[j][i]);
                }
            }
        }
    }

}
