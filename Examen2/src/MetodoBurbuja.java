public class MetodoBurbuja {
    int i, j, temporal;

    public MetodoBurbuja() {
        this.i = 0;
        this.j = 0;
        this.temporal = 0;
    }

    public void burbuja(int [] array){
        for (i=0; i<array.length; i++){
            for (j=i+1; j<array.length; j++){
                if (array[i] > array[j]){
                    temporal = array[i];
                    array[i] = array[j];
                    array[j] = temporal;
                }
            }
        }
    }

    public void mostrar(int [] arreglo){
        int k;
        for (k=0; k<arreglo.length; k++){
            System.out.println( arreglo[k] );
        }
    }


}