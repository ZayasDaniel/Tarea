public class Main {

    static class Lista {
        private long[] array;

        Lista(int size) {
            array = new long[size];
        }

        void add(int inicio, int fin, long valor) {
            array[inicio - 1] += valor;
            if (fin < array.length) {
                array[fin] -= valor;
            }
        }

        long getValorMax() {
            long max = 0;
            long actu = 0;

            for (long num : array) {
                actu += num;
                max = Math.max(max, actu);
            }

            return max;
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int[][] Consultas = {{7, 9, 10}, {1, 3, 5}, {9, 1, 9}};

        Lista customList = new Lista(n);

        for (int[] consulta : Consultas) {
            int a = consulta[0];
            int b = consulta[1];
            long k = consulta[2];
            customList.add(a, b, k);
        }

        long Resultado = customList.getValorMax();
        System.out.println("El resultado es: " + Resultado);
    }
}