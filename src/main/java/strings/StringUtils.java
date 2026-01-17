package strings;

public class StringUtils {

    public static boolean isBlank(String string) {
        return  string == null || string.trim().isEmpty();
    }

    public static String reverse(String string) {
        if (string == null) return null;
        return new StringBuilder(string).reverse().toString();
    }

    public static int countVowels(String string) {
        if (string == null) return 0;

        int count = 0;
        String vowels = "aeiouAEIOU";

        for (char c : string.toCharArray()) {
            if (vowels.indexOf(c) >= 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(isBlank(" "));
        System.out.println(reverse("Hi my name is Theodore!"));
        System.out.println(countVowels("I'm Theodore"));
    }

}
