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
public class Vector {
    
    protected int valor;
    //metodo que modifica el contenido de la posicion p de un array con el valor pasado

    public void Visualizar(int[] vector, int i) {
        System.out.print("v={");
        for (i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + ",");
        }
        System.out.println("}");
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }
    
}
