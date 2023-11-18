public class MainQuicksort {
    public static void main(String[] args) {
        Quicksort quick = new Quicksort();
        int[] vector = {95,36,42,0,32,58,73,28,43,12,50};
        System.out.println("Arreglo original:");
        quick.mostrarqs(vector);
        System.out.println("");
        System.out.println("Arreglo ordenado con Quicksort:");
        quick.Quick(vector,0, vector.length-1);
//se muestra el pivoteo y lo ultimo es el arreglo ordenado

    }
}