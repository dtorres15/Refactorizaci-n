/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorizacion1;

/**
 *
 * @author diurno
 */
public class Refactorizacion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[5];
        vector[0] = 2;
        vector[1] = 4;
        vector[2] = 6;
        vector[3] = 8;
        Prueba p = new Prueba();
        p.valor = 10;
        p.modificar(vector, 0, 1);
        p.borrar(vector, 0, 1);
        p.insertar(vector, 0, 1);
    }
    
}



