package PPJ_17_Artur;

public class Ex4 {
    public static void main(String[] args) {
        String result = convBase(55, 21);
        System.out.println(result);
    }

    public static String convBase(int number, int base) {
        String convertedNumber = "";

        while (number != 0) {
            int remainder;
            remainder = number % base;
            if (remainder < 10) {
                convertedNumber += String.valueOf(remainder);
            } else {
                char digit = (char) (remainder + 55);
                convertedNumber += digit;
            }
            number /= base;
        }

        String reversedNumber = "";
        for (int i = convertedNumber.length() - 1; i >= 0; i--) {
            reversedNumber += convertedNumber.charAt(i);
        }

        return reversedNumber;
    }
}
