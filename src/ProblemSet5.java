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
        //System.out.print(ps.endsMeet("atlanta", 2));
        System.out.print(ps.middleMan( ));
        //ps.isCentered();
        //ps.countMe();
        //ps.triplets();
        //ps.addMe();
        //ps.sequence();
        //ps.intertwine();
        //ps.isPalindrome();
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
        return out.substring(0,2) + in + out.substring(out.length() - 2, out.length());

    }

    /*
     * Exercise 2.
     *
     * Given a string and an integer, return a new string that represents the first
     * and last n characters of text.
     */

    public String endsMeet(String text, int n) {
        if (text.length() <= 10 && text.length() >= 1 && n >= 1 && n <= text.length()) {
            return text.substring(0, n) + text.substring(text.length() - n, text.length());
        } else {
            return text;
        }
    }

    /*
     * Exercise 3.
     *
     * Given a string, return a new string using the middle three characters of text.
     */

    public String middleMan(String text) {
        if (text.length() % 2 == 1){
            return text.substring(text.length() / 2 - 1, text.length() / 2 + 2);
        } else {
            return text;
        }
    }

    /*
     * Exercise 4.
     *
     * Given two strings, determine whether or not target is equivalent to the middle
     * three characters of text.
     */

    public boolean isCentered(String text, String target) {
        return true;
    }

    /*
     * Exercise 5.
     *
     * Given a string and a character, compute the number of words that end in suffix.
     */

    public int countMe(String text, char suffix) {
        return 1;
    }

    /*
     * Exercise 6.
     *
     * Given a string, compute the number of triplets in text.
     */

    public int triplets(String text) {
        return 1;
    }

    /*
     * Exercise 7.
     *
     * Given a string, compute the sum of the digits in text.
     */

    public long addMe(String text) {
        return 1;
    }

    /*
     * Exercise 8.
     *
     * Given a string, compute the length of the longest sequence.
     */

    public long sequence(String text) {
        return 10;
    }

    /*
     * Exercise 9.
     *
     * Given two strings, return a new string built by intertwining each of the
     * characters of a and b.
     */

    public String intertwine(String a, String b) {
        return "hi";
    }

    /*
     * Exercise 10.
     *
     * Given a string, determine whether or not it is a palindrome.
     */

    public boolean isPalindrome(String text) {
        return true;
    }
}
