package strings;

public class StringUtils {
    public static void main(String[] args) {
        System.out.println(isBlank(" "));
        System.out.println(reverse("Java"));
        System.out.println(countVowels("Hello World"));
    }
    public static boolean isBlank(String input) {
        return  input == null || input.trim().isEmpty();
    }

    public static String reverse(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }

    public static int countVowels(String input) {
        if (input == null) return 0;

        int count = 0;
        String vowels = "aeiouAEIOU";

        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) >= 0) {
                count++;
            }
        }
        return count;
    }
}
