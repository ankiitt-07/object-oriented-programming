 class PalindromeChecker {
    
    private final String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

public class PalindromeString {
    public static void main(String[] args) {
        PalindromeChecker p1 = new PalindromeChecker("hello");
        PalindromeChecker p2 = new PalindromeChecker("racecar");

        System.out.println(p1.isPalindrome());
        System.out.println(p2.isPalindrome());
    }
}
