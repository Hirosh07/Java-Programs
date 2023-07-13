public class ${NAME} {
    public static void main(String[] args) {
        String inputString = "1234567890";
        int evenCount = countEvenNumbers(inputString);
        int oddCount = countOddNumbers(inputString);
        int primeCount = countPrimeNumbers(inputString);

        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
        System.out.println("Number of prime numbers: " + primeCount);
    }

    public class EvenNumberCounter {
        public static void main(String[] args) {
            String inputString = "1234567890";
            int evenCount = countEvenNumbers(inputString);
            System.out.println("Number of even numbers: " + evenCount);
        }

        public static int countEvenNumbers(String inputString) {
            int evenCount = 0;
            for (int i = 0; i < inputString.length(); i++) {
                int digit = Character.getNumericValue(inputString.charAt(i));
                if (digit % 2 == 0) {
                    evenCount++;
                }
            }
            return evenCount;
        }
    }

    public class OddNumberCounter {
        public static void main(String[] args) {
            String inputString = "1234567890";
            int oddCount = countOddNumbers(inputString);
            System.out.println("Number of odd numbers: " + oddCount);
        }

        public static int countOddNumbers(String inputString) {
            int oddCount = 0;
            for (int i = 0; i < inputString.length(); i++) {
                int digit = Character.getNumericValue(inputString.charAt(i));
                if (digit % 2 != 0) {
                    oddCount++;
                }
            }
            return oddCount;
        }
    }
    public class PrimeNumberCounter {
        public static void main(String[] args) {
            String inputString = "1234567890";
            int primeCount = countPrimeNumbers(inputString);
            System.out.println("Number of prime numbers: " + primeCount);
        }

        public static int countPrimeNumbers(String inputString) {
            int primeCount = 0;
            for (int i = 0; i < inputString.length(); i++) {
                int digit = Character.getNumericValue(inputString.charAt(i));
                if (isPrime(digit)) {
                    primeCount++;
                }
            }
            return primeCount;
        }

        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }

    }





    public static int countEvenNumbers(String inputString) {
        int evenCount = 0;
        for (int i = 0; i < inputString.length(); i++) {
            int digit = Character.getNumericValue(inputString.charAt(i));
            if (digit % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }

    public static int countOddNumbers(String inputString) {
        int oddCount = 0;
        for (int i = 0; i < inputString.length(); i++) {
            int digit = Character.getNumericValue(inputString.charAt(i));
            if (digit % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount;
    }

    public static int countPrimeNumbers(String inputString) {
        int primeCount = 0;
        for (int i = 0; i < inputString.length(); i++) {
            int digit = Character.getNumericValue(inputString.charAt(i));
            if (isPrime(digit)) {
                primeCount++;
            }
        }
        return primeCount;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
