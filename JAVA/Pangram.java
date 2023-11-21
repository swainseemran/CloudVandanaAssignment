public class Pangram {
    public static void main(String[] args) {
        String input = "Hey dear, are you okay?";
        boolean res = isPangram(input);
        if (res)
            System.out.println("input is a pangram");
        else
            System.out.println("input is not a pangram");
    }

    public static boolean isPangram(String sentence) {
        return checkPangram(sentence.toLowerCase(), 'a');
    }

    private static boolean checkPangram(String sentence, char Char) {
        if (Char > 'z')
            return true;
        boolean present = sentence.indexOf(Char) != -1;
        return present && checkPangram(sentence, (char) (Char + 1));
    }
}
