import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NumberOperationsTest {

    @Test
    public void test_min() {
        int[] numbers = {4, 7, 2, 9, 1};
        assertEquals(1, NumberOperations._min(numbers));
    }

    @Test
    public void test_max() {
        int[] numbers = {4, 7, 2, 9, 1};
        assertEquals(9, NumberOperations._max(numbers));
    }

    @Test
    public void test_sum() {
        int[] numbers = {4, 7, 2, 9, 1};
        assertEquals(23, NumberOperations._sum(numbers));
    }

    @Test
    public void test_mult() {
        int[] numbers = {4, 7, 2, 9, 1};
        assertEquals(504, NumberOperations._mult(numbers));
    }

    @Test
    public void test_speed() {
        int[] numbers = new int[1000000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        long startTime = System.nanoTime();
        NumberOperations._min(numbers);
        NumberOperations._max(numbers);
        NumberOperations._sum(numbers);
        NumberOperations._mult(numbers);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // перевод в миллисекунды
        System.out.println("Время выполнения для 1 млн чисел: " + duration + " мс");
    }
}
