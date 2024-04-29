public class Main {
    public static void main(String[] args) {
        // Тестові дані
        int[][] matrix1 = {
                {1, 2, 3},
                {2, 3, 3},
                {3, 4, 5}
        };

        int[][] matrix2 = {
                {1, 2, 3},
                {2, 3, 3},
                {3, 4, 4}
        };

        // Тестування методу findMostFrequentNumber
        testFindMostFrequentNumber(matrix1);
        testFindMostFrequentNumber(matrix2);
    }

    private static void testFindMostFrequentNumber(int[][] matrix) {
        int mostFrequent = MatrixAnalyzer.findMostFrequentNumber(matrix);
        System.out.println("Матриця: ");
        printMatrix(matrix);
        System.out.println("Число, яке повторюється найбільшу кількість разів: " + mostFrequent);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
