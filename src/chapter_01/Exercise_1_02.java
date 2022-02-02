package chapter_01;

/**
 * Exercise 1.2
 *
 * (Display Five Messages) Write a program that displays "Welcome to Java" five
 * times.
 *
 * @Book Introduction to JAVA Programming, 11 Ed. By Daniel Liang
 * @Date February 2022
 * @author Alex Alford
 */
public final class Exercise_1_02 {

    /**
     * Default constructor--private to prevent instantiation.
     */
    private Exercise_1_02() {

    }

    /**
     * Main method.
     *
     * @param args
     *            the command line arguments; unused here
     */
    public static void main(String[] args) {

        /*
         * Program Title.
         */
        System.out.println("Exercise 1.2: Display Five Messages\n");

        /*
         * Output message to console five times.
         */
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");

        /*
         * Close output stream.
         */
        System.out.close();
    }

}
