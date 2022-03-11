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
public class NoCambiaLongitud extends Vector{
    private int valor;
//metodo que modifica el contenido de la posicion p de un array con el valor pasado

        void BorraElemento(int[] vector, int posicion, int i) {
            System.out.println("Elemento a borrar=" + vector[posicion]);
            for (i = posicion; i < vector.length - 1; i++) {
                vector[i] = vector[i + 1];
            }
        }

        void ModificaElemento(int[] vector, int posicion) {
//mostramos su contenido
            System.out.println("Elemento a modificar=" + vector[posicion]);
            vector[posicion] = this.getValor();
        }


    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
        
       
       
       
       
       
}
