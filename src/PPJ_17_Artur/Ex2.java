package PPJ_17_Artur;

public class Ex2 {
    public static void main(String[] args) {
        // Test cases
        System.out.println(isPalindrome("eye"));
        System.out.println(isPalindrome2("eye"));

        // Additional test cases
        System.out.println(isPalindrome("hello"));
        System.out.println(isPalindrome2("hello"));
    }

    // Recursive approach
    public static boolean isPalindrome(String word) {
        if (word.length() <= 1) {
            return true;
        }

        if (word.charAt(0) != word.charAt(word.length() - 1)) {
            return false;
        }

        return isPalindrome(word.substring(1, word.length() - 1));
    }

    // Iterative approach
    public static boolean isPalindrome2(String word) {
        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
