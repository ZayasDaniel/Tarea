public class Cola {
    NodoCola inicio;
    NodoCola fin;
    int tamano;

    public Cola() {
        inicio = fin = null;
        tamano = 0;
    }

    // Metodo para saber si esta vacia
    public boolean estaVacia() {
        return inicio == null;
    }

    // Metodo para insertar un elemento
    public void insertar(int elemento) {
        NodoCola nuevo = new NodoCola(elemento);
        if (estaVacia()){
            inicio = nuevo;

        } else {
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        tamano++;
    }

    // Metodo para eliminar un elemento
    public  int eliminar(){
        int aux = inicio.dato;
        inicio = inicio.siguiente;
        tamano--;
        return aux;
    }

    // Metodo para conocer la cabecera de la cola
    public int inicioCola(){
        return inicio.dato;
    }

    // Metodo para saber el tamaño de la cola
    public int tamanoCola(){
        return  tamano;
    }



}
