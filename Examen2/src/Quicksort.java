public class Quicksort {
    public void Quick(int []array, int primero, int ultimo ){
        int i, j, pivote, auxiliar;
        i = primero;
        j = ultimo;
        pivote = array[(primero + ultimo)/2];
        System.out.println("El pivote es "+ pivote);
        do {
            while (array[i] < pivote){
                i++;
            }
            while (array[j] > pivote){
                j--;
            }
            if (i <= j){
                auxiliar = array[i];
                array[i] = array[j];
                array[j] = auxiliar;
                i++;
                j--;
            }
        }while (i <= j);
        if (primero < j){
            Quick(array, primero, j);
        }
        if (i < ultimo){
            Quick(array, i, ultimo);

        }
        mostrarqs(array);

    }

    public void mostrarqs(int[] array) {
        int k;
        for (k=0; k<array.length; k++){
            System.out.println( array[k] );
        }
    }
}