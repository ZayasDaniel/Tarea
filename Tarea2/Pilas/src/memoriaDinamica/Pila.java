package memoriaDinamica;

import memoriaDinamica.NodoPila;

public class Pila {
    private NodoPila cima;
    int tamano;
    public Pila(){
        cima = null;
        tamano = 0;
    }

    // METODO PARA SABER CUANDO LA PILA ESTA VACIA
    public boolean estaVacia(){
        return  cima == null;

    }

    // METODO PARA INSERTAR (PUSH) UN ELEMENTO EN LA PILA
    public void empujar(int elemento){
        NodoPila nuevo = new NodoPila(elemento);
        nuevo.siguiente = cima;
        cima = nuevo;
        tamano++;

    }

    // METODO PARA SACAR (POP) UN ELEMENTO DE LA PILA
    public int sacar(){
        int aux = cima.dato;
        cima = cima.siguiente;
        tamano--;
        return aux;

    }

    // METODO PARA SABER CUAL ES EL VALOR DE LA CIMA DE NUESTRA PILA
    public int cima(){
        return cima.dato;

    }

    // METODO PARA SABER EL TAMAÑO DE NUESTRA PILA
    public int tamaPila(){
        return tamano;

    }

    // METODO PARA LIMPIAR (VACIAR) LA PILA
    public void  limpiarPila(){
        while (!estaVacia()){
            sacar();
        }
    }
}
