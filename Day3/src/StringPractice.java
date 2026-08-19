public class StringPractice {

    public static String reverse(String input) {

        StringBuilder result = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            result.append(input.charAt(i));
        }

        return result.toString();
    }

    public static boolean isPalindrome(String input) {

        String reversed = reverse(input);

        return input.equals(reversed);
    }

    public static void main(String[] args) {

        // Bài 1: String vs StringBuilder
        long startString = System.nanoTime();

        String result = "";

        for (int i = 0; i < 10000; i++) {
            result = result + i;
        }

        long endString = System.nanoTime();

        System.out.println(
                "String: " + (endString - startString) + " ns"
        );


        long startBuilder = System.nanoTime();

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 10000; i++) {
            builder.append(i);
        }

        long endBuilder = System.nanoTime();

        System.out.println(
                "StringBuilder: " + (endBuilder - startBuilder) + " ns"
        );


        // Bài 2: String Pool
        String a = "abc";
        String b = new String("abc");

        System.out.println(a == b);
        System.out.println(a.equals(b));


        // Bài 3: Reverse
        System.out.println(reverse("hello"));


        // Bài 4: Palindrome
        System.out.println(isPalindrome("madam"));
        System.out.println(isPalindrome("hello"));
    }
}
