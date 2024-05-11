import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberOperations {
    public static void main(String[] args) {
        String filename = "numbers.txt"; // Имя файла с числами
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);

            // Считываем числа из файла
            String[] numbersString = scanner.nextLine().split(" ");
            int[] numbers = new int[numbersString.length];
            for (int i = 0; i < numbersString.length; i++) {
                numbers[i] = Integer.parseInt(numbersString[i]);
            }

            // Вывод результатов
            System.out.println("Минимальное: " + _min(numbers));
            System.out.println("Максимальное: " + _max(numbers));
            System.out.println("Сумма: " + _sum(numbers));
            System.out.println("Произведение: " + _mult(numbers));

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }

    // Поиск минимального числа
    public static int _min(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    // Поиск максимального числа
    public static int _max(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    // Сумма всех чисел
    public static int _sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    // Произведение всех чисел
    public static int _mult(int[] numbers) {
        int mult = 1;
        for (int number : numbers) {
            mult *= number;
        }
        return mult;
    }
}
