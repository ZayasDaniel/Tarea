public class Algoritmo {

    public static int metodo(int n, int[][] queries) {
        // Inicializar el arreglo de diferencias
        int[] arr = new int[n + 1];

        // Realizar las operaciones en el arreglo de diferencias
        for (int[] query : queries) {
            int a = query[0];
            int b = query[1];
            int k = query[2];

            arr[a - 1] += k;  // Agregar k en el índice a-1
            arr[b] -= k;  // Restar k en el índice b
        }

        // Calcular el arreglo de sumas acumuladas
        int[] prefixSum = new int[n + 1];
        int maxValor = 0;
        int valorActual = 0;

        for (int i = 0; i < n; i++) {
            valorActual += arr[i];
            prefixSum[i] = valorActual;
            maxValor = Math.max(maxValor, valorActual);
        }

        return maxValor;
    }

    public static void main(String[] args) {
        int n = 10;
        int[][] queries = {{1, 5, 3}, {4, 8, 7}, {6, 9, 1}};

        int resultado = metodo(n, queries);
        System.out.println("El valor máximo después de las operaciones es: " + resultado);
    }
}
