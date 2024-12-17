public class PrimeNumbers {
    public static void main(String[] args) {

        for (int i = 2; i <= 100; i++) {

            for (int j = 2; j <= 10; j++) {

                if (i != j && i % j == 0) {
                    i++;
                    j = 1;
                }
            }
            System.out.print(i + " ");
        }
    }
}