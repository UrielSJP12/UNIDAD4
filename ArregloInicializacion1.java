/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arregloinicializacion1;

/**
 *
 * @author Usuario
 */
public class ArregloInicializacion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [][] nombres = {
            {"pao", "jessi", "jesus"},  
            {"pablo", "karla", "isma"},
            {"fanny", "alex", "samuel"},
        };
        
        //leer
        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres[i].length; j++) {
                System.out.print(nombres[i][j] + ",");
            }
            System.out.println();
        }
    }
    
}
