public class StringPractice {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World";

        // 1. length()
        System.out.println("Length of str1: " + str1.length());

        // 2. concat()
        System.out.println("Concatenation: " + str1.concat(" " + str2));

        // 3. toUpperCase()
        System.out.println("Uppercase of str1: " + str1.toUpperCase());

        // 4. substring()
        System.out.println("Substring of str1 (1 to 4): " + str1.substring(1, 4));

        // 5. equals()
        System.out.println("Are str1 and str2 equal? " + str1.equals(str2));
    }
}
