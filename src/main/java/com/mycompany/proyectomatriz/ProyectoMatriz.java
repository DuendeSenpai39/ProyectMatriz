/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectomatriz;

/**
 *
 * @author Jose
 */
public class ProyectoMatriz {

    public static void main(String[] args) {
        var arreglo1 = new Arreglo();
        var arreglo2 = new Arreglo();
        var vector1 = arreglo1.crearVector(4);
        System.out.println("El primer vector: ");
        for (int i = 0; i < vector1.length; i++) {
            System.out.print(vector1[i] + " ");
        }
        System.out.print("\n");
        var vector2 = arreglo2.crearVector(4);
        System.out.println("El segundo vector: ");
        for (int i = 0; i < vector2.length; i++) {
            System.out.print(vector2[i] + " ");
        }
        System.out.print("\n");
        var sumaVectores = new Arreglo();
        var sumaTotal = sumaVectores.sumaVector(vector1, vector2);
        System.out.println("El vector total es  ");
        for (int i = 0; i < vector2.length; i++) {
            System.out.print(sumaTotal[i] + " ");
        }
        System.out.print("\n");
        var arreglo3 = new Arreglo();
        var arreglo4 = new Arreglo();
        var matriz1 = arreglo3.crearMatriz(3, 3);
        for (int a = 0; a < vector1.length; a++) {
            for (int b = 0; b < vector1.length; b++) {

                System.out.print(matriz1[a][b] + " ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        var matriz2 = arreglo4.crearMatriz(3, 3);
        for (int l = 0; l < vector2.length; l++) {
            for (int n = 0; n < vector2.length; n++) {
                System.out.print(matriz2[l][n] + " ");
            }
            System.out.print("\n");
        }
        var sumaM = new Arreglo();
        var sumaM2 = sumaVectores.sumaMatriz(matriz1, matriz2);
        System.out.println("La suma de las dos matrices es de ");
        for (int i = 0; i < vector2.length; i++) {
            for (int j = 0; j < vector2.length; j++) {
                System.out.print(sumaM2[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}

