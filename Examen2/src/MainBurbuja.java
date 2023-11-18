public class MainBurbuja {
    public static void main(String[] args) {
        MetodoBurbuja ordenar = new MetodoBurbuja();
        int[] vector = {95,36,42,0,32,58,73,28,43,12,50};
        System.out.println("Arreglo original:");
        ordenar.mostrar(vector);
        System.out.println("Arreglo ordenado:");
        ordenar.burbuja(vector);
        ordenar.mostrar(vector);
    }
}