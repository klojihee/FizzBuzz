public class Multiples {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;

        while (i < 1000) {
            count += doMultiples(i);
            i++;
        }
        System.out.println(count);
    }

    private static int doMultiples(int i) {
        // Find out which numbers divide i.
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 || divisibleBy5) {
            return 1;
        } else {
            return 0;
        }
    }
}
