package com.mycompany.matriz;

import javax.swing.JOptionPane;

/**
 *
 * @author alexf
 */
public class calculadora {

    int[][] matriza;
    int[][] matrizb;
    int[][] suma;
    int[][] resta;
    int[][] multiplicacion;

    public void mostrarMensaje() {
        System.out.println("Bienvenido al Libro de Calificaciones !");
    }

    public void CrearmatrizA(int fila, int columna) {
        matriza = new int[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                matriza[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion [" + (i + 1) + "," + (j + 1) + "] :"));
            }
        }
    }

    public void CrearmatrizB(int fila, int columna) {
        matrizb = new int[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                matrizb[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese posicion [" + (i + 1) + "," + (j + 1) + "] :"));
            }
        }
    }

    public void ImprimirMatrizA() {
        String resultado = "";
        for (int[] matriza1 : matriza) {
            for (int j = 0; j < matriza1.length; j++) {
                resultado += matriza1[j];
                resultado += "    ";
            }
            resultado += "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }

    public void ImprimirMatrizB() {
        String resultado = "";
        for (int[] matrizb1 : matrizb) {
            for (int j = 0; j < matrizb1.length; j++) {
                resultado += matrizb1[j];
                resultado += "    ";
            }
            resultado += "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }

    public void MultiplicarAxN(int num) {
        int[][] mul = new int[matriza[0].length][matriza.length];
        String resultado = "";
        for (int x = 0; x < matriza.length; x++) {
            for (int y = 0; y < matriza[x].length; y++) {
                mul[x][y] = num * matriza[x][y];
            }
        }
        for (int[] mul1 : mul) {
            for (int j = 0; j < mul1.length; j++) {
                resultado += mul1[j];
                resultado += "    ";
            }
            resultado += "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }

    public void MultiplicarBxN(int num) {
        int[][] mul = new int[matrizb[0].length][matrizb.length];
        String resultado = "";
        for (int x = 0; x < matrizb.length; x++) {
            for (int y = 0; y < matrizb[x].length; y++) {
                mul[x][y] = num * matrizb[x][y];
            }
        }
        for (int[] mul1 : mul) {
            for (int j = 0; j < mul1.length; j++) {
                resultado += mul1[j];
                resultado += "    ";
            }
            resultado += "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }

    public void TrasponerA() {
        int[][] matrizT = new int[matriza[0].length][matriza.length];
        String resultado = "";
        for (int x = 0; x < matriza.length; x++) {
            for (int y = 0; y < matriza[x].length; y++) {
                matrizT[y][x] = matriza[x][y];
            }
        }
        for (int[] matrizT1 : matrizT) {
            for (int j = 0; j < matrizT1.length; j++) {
                resultado += matrizT1[j];
                resultado += "    ";
            }
            resultado += "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }

    public void TrasponerB() {
        int[][] matrizT = new int[matrizb[0].length][matrizb.length];
        String resultado = "";
        for (int x = 0; x < matrizb.length; x++) {
            for (int y = 0; y < matrizb[x].length; y++) {
                matrizT[y][x] = matrizb[x][y];
            }
        }
        for (int[] matrizT1 : matrizT) {
            for (int j = 0; j < matrizT1.length; j++) {
                resultado += matrizT1[j];
                resultado += "    ";
            }
            resultado += "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }

    public void DeterminanteA() {
        int deter;
        switch (matriza.length) {
            case 2:
                deter = matriza[0][0] * matriza[1][1] - matriza[0][1] * matriza[1][0];
                JOptionPane.showMessageDialog(null, deter);
                break;
            case 3:
                deter = ((matriza[0][0]*matriza[1][1]*matriza[2][2])+(matriza[0][1]*matriza[1][2]*matriza[2][0])+(matriza[0][2]*matriza[1][0]*matriza[2][1]))
                        -((matriza[2][0]*matriza[1][1]*matriza[0][2])+(matriza[2][1]*matriza[1][2]*matriza[0][0])+(matriza[2][2]*matriza[1][0]*matriza[0][1]));
                JOptionPane.showMessageDialog(null, deter);
                break;
            default:
                JOptionPane.showMessageDialog(null, "No puedo calcular esto");
                break;
        }
    }
    
    public void DeterminanteB() {
        int deter;
        switch (matriza.length) {
            case 2:
                deter = matrizb[0][0] * matrizb[1][1] - matrizb[0][1] * matrizb[1][0];
                JOptionPane.showMessageDialog(null, deter);
                break;
            case 3:
                deter = ((matrizb[0][0]*matrizb[1][1]*matrizb[2][2])+(matrizb[0][1]*matrizb[1][2]*matrizb[2][0])+(matrizb[0][2]*matrizb[1][0]*matrizb[2][1]))
                        -((matrizb[2][0]*matrizb[1][1]*matrizb[0][2])+(matrizb[2][1]*matrizb[1][2]*matrizb[0][0])+(matrizb[2][2]*matrizb[1][0]*matrizb[0][1]));
                JOptionPane.showMessageDialog(null, deter);
                break;
            default:
                JOptionPane.showMessageDialog(null, "No puedo calcular esto");
                break;
        }
    }

    public void Sumarmatrices() {
        int a = matriza.length;
        int b = matrizb.length;
        suma = new int[a][b];
        String resultado = "";
        if (a == b) {
            for (int i = 0; i < matriza.length; i++) {
                for (int j = 0; j < matrizb[i].length; j++) {
                    suma[i][j] = matriza[i][j] + matrizb[i][j];
                }
            }
            for (int[] suma1 : suma) {
                for (int j = 0; j < suma1.length; j++) {
                    resultado += suma1[j];
                    resultado += "    ";
                }
                resultado += "\n";
            }
            JOptionPane.showMessageDialog(null, resultado);
            //System.out.println("Work");
        } else {
            JOptionPane.showMessageDialog(null, "Las matrices no son cuadradas.");
        }
    }

    public void RestarMatrices() {
        int a = matriza.length;
        int b = matrizb.length;
        resta = new int[a][b];
        String resultado = "";
        if (a == b) {
            for (int i = 0; i < matriza.length; i++) {
                for (int j = 0; j < matrizb[i].length; j++) {
                    resta[i][j] = matriza[i][j] - matrizb[i][j];
                }
            }
            for (int[] resta1 : resta) {
                for (int j = 0; j < resta1.length; j++) {
                    resultado += resta1[j];
                    resultado += "    ";
                }
                resultado += "\n";
            }
            JOptionPane.showMessageDialog(null, resultado);
        } else {
            JOptionPane.showMessageDialog(null, "Las matrices no son simetricas");
        }
    }

    public void MultiplicarMatrices() {
        int[][] c = new int[matriza.length][matrizb[0].length];
        String resultado = "";
        // se comprueba si las matrices se pueden multiplicar
        if (matriza[0].length == matrizb.length) {
            for (int i = 0; i < matriza.length; i++) {
                for (int j = 0; j < matrizb[0].length; j++) {
                    for (int k = 0; k < matriza[0].length; k++) {
                        // aquí se multiplica la matriz
                        c[i][j] += matriza[i][k] * matrizb[k][j];
                    }
                }
            }
            for (int[] c1 : c) {
                for (int j = 0; j < c1.length; j++) {
                    resultado += c1[j];
                    resultado += "    ";
                }
                resultado += "\n";
            }
            JOptionPane.showMessageDialog(null, resultado);

        } /**
         * si no se cumple la condición se retorna una matriz vacía
         */
        else {
            JOptionPane.showMessageDialog(null, "Las matrices no son cuadradas.");
        }
    }
}
