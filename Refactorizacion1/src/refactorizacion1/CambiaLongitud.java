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
public class CambiaLongitud extends Vector {

        public void modificar(int[] vector, int LongitudActual, int posicion) {
            int i;
//Mostramos los elementos del array
            System.out.print("v={");
        final int longitud = vector.length;
            for (i = 0; i < longitud; i++) {
                System.out.print(vector[i] + ",");
            }
            System.out.println("}");
//Modificamos el array
            if (posicion < longitud) {
                ModificaElemento(vector, posicion);
            }
//Mostramos los elementos del array
            System.out.print("v={");
            for (i = 0; i < longitud; i++) {
                System.out.print(vector[i] + ",");
            }
            System.out.println("}");
        }
//metodo que borra el elemento de la posicion p desplazando a la izquierda todos los elementos

        public void borrar(int[] vector, int ongitudActual, int posicion) {
            int i;
//mostramos su contenido
//Mostramos los elementos del array
            System.out.print("v={");
        final int longitud = vector.length;
            for (i = 0; i < longitud; i++) {
                System.out.print(vector[i] + ",");
            }
            System.out.println("}");
//Borramos el elemento
            if (posicion < longitud) {
                BorraElemento(vector, posicion, i);
            }
//Mostramos los elementos del array
            System.out.print("v={");
            for (i = 0; i < longitud; i++) {
                System.out.print(vector[i] + ",");
            }
            System.out.println("}");
        }
//metodo que inserta un elemento en la posicion p desplazando a la derecha todos los elementos

        public void insertar(int[] vector, int LongitudActual, int posicion) {
            int i;
//mostramos su contenido
//Mostramos los elementos del array
            System.out.print("v={");
        final int longitud = vector.length;
            for (i = 0; i < longitud; i++) {
                System.out.print(vector[i] + ",");
            }
            System.out.println("}");
//Borramos el elemento
            if (posicion < longitud) {
                System.out.println("Elemento a insertar=" + this.getValor());
            for (i = longitud - 1; i > posicion; i--) {
                vector[i] = vector[i - 1];
            }
            vector[posicion] = this.getValor();
            }
//Mostramos los elementos del array
            System.out.print("v={");
            for (i = 0; i < longitud; i++) {
                System.out.print(vector[i] + ",");
            }
            System.out.println("}");
        }

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
