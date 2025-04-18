import java.util.*;

public class SumWithAutoboxing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers separated by spaces: ");
        String[] input = sc.nextLine().split(" ");

        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;

        for (String numStr : input) {
            // Autoboxing: converting int to Integer
            Integer num = Integer.parseInt(numStr);
            numbers.add(num);
        }

        for (Integer number : numbers) {
            // Unboxing: converting Integer to int
            sum += number;
        }

        System.out.println("Sum of numbers: " + sum);
    }
}
