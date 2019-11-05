/**
 * Problem Set 5.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * built-in methods, most notable of the String class. It is also your first
 * introduction to methods that accept parameters and return values. The main
 * method is declared, but it is up to you to implement. Write your code for each
 * exercise in the corresponding method. Make sure you test your code thoroughly.
 *
 * The specifications for each exercise are outlined below. Your job is to write
 * lines of code to produce answers to my questions. Each exercise requires that
 * you ask the user to enter one or more values. Your code must meet the
 * requirements set forth in this section.
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

public class ProblemSet5 {

    public static void main(String[] args) {
        ProblemSet5 ps = new ProblemSet5();
        //System.out.print(ps.surroundMe("aise ", "prra"));
        //System.out.print(ps.endsMeet("killlakill", 2));
        //System.out.print(ps.middleMan("qw"));
        //System.out.print(ps.isCentered("qucckzz", "cck"));
        //System.out.print(ps.countMe("ii", 'i'));
        //System.out.print(ps.triplets("   "));
        //System.out.print(ps.addMe("2 plus 2 is..."));
        //System.out.print(ps.sequence("          aa"));
        //System.out.print(ps.intertwine("", "el!"));
        System.out.print(ps.isPalindrome(" "));
    }

    /*
     * Exercise 1.
     *
     * Given two strings, return a new string built by surrounding in with the first
     * and last two characters of out.
     */

    public String surroundMe(String in, String out) {
        if (in == null || out.length() != 4) {
            return in;
        }
        return out.substring(0, 2) + in + out.substring(out.length() - 2, out.length());
    }

    /*
     * Exercise 2.
     *
     * Given a string and an integer, return a new string that represents the first
     * and last n characters of text.
     */

    public String endsMeet(String text, int n) {
        if (text == null || !(text.length() <= 10 && text.length() >= 1 && n >= 1 && n <= text.length())) {
            return text;
        } else {
            return text.substring(0, n) + text.substring(text.length() - n, text.length());
        }
    }

    /*
     * Exercise 3.
     *
     * Given a string, return a new string using the middle three characters of text.
     */

    public String middleMan(String text) {
        if (text == null || text.length() % 2 != 1 || text.length() < 3) {
            return text;
        } else {
            return text.substring(text.length() / 2 - 1, text.length() / 2 + 2);
        }
    }

    /*
     * Exercise 4.
     *
     * Given two strings, determine whether or not target is equivalent to the middle
     * three characters of text.
     */

    public boolean isCentered(String text, String target) {
        if (text == null || target == null || (text.length() % 2 == 0) || text.length() < 3  || target.length() != 3 || !((text.substring(text.length() / 2 - 1, text.length() / 2 + 2)).equals(target))) {
            return false;
        } else {
            return true;
        }

    }

    /*
     * Exercise 5.
     *
     * Given a string and a character, compute the number of words that end in suffix.
     */

    public int countMe(String text, char suffix) {
        int count = 0;
        if (text == null || !(Character.toString(suffix).matches("[a-zA-Z]"))) {
            return -1;
        }
        for (int i  = 0; i < text.length(); i++) {
            if ((i + 1 == text.length() || text.substring(i + 1, i + 2).equals(" ")) && (text.substring(i, i + 1).equals(Character.toString(suffix)))) {
                count++;
            }
        }
        return count;
    }

    /*
     * Exercise 6.
     *
     * Given a string, compute the number of triplets in text.
     */

    public int triplets(String text) {
        int triplets = 0;
        if (text == null) {
            return -1;
        }
        for (int i = 0; i < text.length() - 2; i++) {
            if ((text.substring(i, i + 1).equals(text.substring(i + 1, i + 2))) && (text.substring(i, i + 1).equals(text.substring(i + 2, i + 3))) && !(text.substring(i, i + 1).equals(" "))) {
                triplets++;
            }
        }
        return triplets;
    }

    /*
     * Exercise 7.
     *
     * Given a string, compute the sum of the digits in text.
     */

    public long addMe(String text) {
        int sum = 0;
        if (text == null) {
            return -1;
        }
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(text.charAt(i))){
                sum += Integer.valueOf(text.substring(i, i + 1));
            }
        }
        return sum;
    }

    /*
     * Exercise 8.
     *
     * Given a string, compute the length of the longest sequence.
     */

    public long sequence(String text) {
        int length = 0;
        int currentLength = 0;
        if (text == null) {
            return -1;
        }
        for (int i = 0; i < text.length() - 1; i++) {
            for (int j = 1; j + i < text.length() - 1; j++) {
                if (text.charAt(i) == (text.charAt(i + j))) {
                    currentLength++;
                }
            }
            if (currentLength > length){
                length = 1 + currentLength;
            }
            currentLength = 0;
        }
        return length;
    }

    /*
     * Exercise 9.
     *
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */

    public String intertwine(String a, String b) {
        String ab = "";
        if (a == null || b == null) {
            return null;
        }

        for (int i = 0; i < a.length() + b.length(); i++) {
            if (i < a.length()) {
                ab += a.charAt(i);
            }
            if (i < b.length()) {
                ab += b.charAt(i);
            }
        }
        return ab;
    }

    /*
     * Exercise 10.
     *
     * Given a string, determine whether or not it is a palindrome.
     */

    public boolean isPalindrome(String text) {
        String txet = "";
        if (text == null) {
            return false;
        }
        for (int i = text.length() - 1; i >= 0; i--) {
            txet += text.charAt(i);
        }
        if (txet.equals(text)){
            return true;
        } else {
            return false;
        }
    }
}
