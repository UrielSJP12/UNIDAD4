/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglosbidimensionales1;

/**
 *
 * @author Usuario
 */
public class ArreglosBidimensionales1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         char [][] vocales = new char [3][5];
       char letra = 'A';
       
        for (char i = 0; i <3; i++) {
            for (char j = 0; j <5 ; j++) { 
                vocales [i][j] = letra;
                letra++;
            }
                    }
        for (char  i = 0; i < 3; i++) {
            for (char  j = 0; j < 5; j++) {
                System.out.print(vocales[i][j] + " ");                
            }
                System.out.println();

        }
    }
    
}
