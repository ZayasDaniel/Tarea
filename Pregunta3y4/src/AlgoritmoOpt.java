public class AlgoritmoOpt {

    public static int calcularValorMaximo(int n, int[][] queries) {
        int[] arr = new int[n + 1];

        for (int[] query : queries) {
            int a = query[0];
            int b = query[1];
            int k = query[2];

            arr[a] += k;
            if (b + 1 <= n) {
                arr[b + 1] -= k;
            }
        }

        int maxVal = arr[1];
        for (int i = 2; i <= n; i++) {
            arr[i] += arr[i - 1];
            maxVal = Math.max(maxVal, arr[i]);
        }

        return maxVal;
    }

    public static void main(String[] args) {
        int n = 10;
        int[][] queries = {
                {1, 5, 3},
                {4, 8, 7},
                {6, 9, 1}
        };

        int result = calcularValorMaximo(n, queries);
        System.out.println("El valor máximo después de aplicar las operaciones es: " + result);
    }
}
