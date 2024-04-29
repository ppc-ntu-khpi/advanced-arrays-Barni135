import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class MatrixAnalyzer {
    /**
     * Метод для пошуку числа, яке повторюється найбільшу кількість разів в матриці.
     * @param matrix Матриця цілих чисел.
     * @return Число, яке повторюється найбільшу кількість разів в матриці.
     */
    public static int findMostFrequentNumber(int[][] matrix) {
        // Плоске вирівнювання матриці та підрахунок кількості входжень кожного числа
        Map<Integer, Long> frequencyMap = Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .boxed()
                .collect(Collectors.groupingBy(
                        i -> i,
                        Collectors.counting()
                ));

        // Знаходження числа, яке повторюється найбільшу кількість разів
        return frequencyMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(0);
    }
}
