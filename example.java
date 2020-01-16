/**
 * This program is an example of code formatting and is not designed to 
 * produce any meaningful results.
 *
 * @author: John Deal
*/

import java.util.Scanner;

public class CodeExample
{
    // Joke numbers.
    final static int SINGER_JOKE_NUMBER    = 1;
    final static int GUITARIST_JOKE_NUMBER = 2;

    /**
     * Returns joke based on jokeNumber.
     *
    **/
    public static String getMusicJoke(int jokeNumber)
    {
        final String NO_JOKE     = "No Joke";
        final String SINGER_JOKE = "How do you tell if there is a singer " +
            "at the door?  They never have the right key and don't know " +
            "when to come in!";
        final String GUITARIST_JOKE = "How do you get a guitarist to be " +
            "quiet?  Put sheet music in front of them!";

        String joke;


        switch (jokeNumber)
        {
            case SINGER_JOKE_NUMBER:
            {
                joke = SINGER_JOKE;
                break;
            }

            case GUITARIST_JOKE_NUMBER:
            {
                joke = GUITARIST_JOKE;
                break;
            }

            default:
            {
                joke = NO_JOKE;
                break; // Not necessary but good practice.
            }
        } // End switch (jokeNumber).

        return joke;
    }

    /**
     * Program entry point.
    **/
    public static void main(String[] args)
    {
        final int MIN_COUNTER = 0;
        final int MAX_COUNTER = 10;

        String className = "CodeExample";
        int    counter;
        float  value;       


        className = "CodeExample";

        for (counter = MIN_COUNTER; counter < MAX_COUNTER; counter++)
        { // Print class name with incrementing counter appended.
            System.out.println("Name: " + className + "_" + counter);
        }

        System.out.println("-----------------"); // Output divide.

        while (counter > MIN_COUNTER)
        { // Print class name with decrementing counter appended.
            System.out.println("Name: " + className + "_" + counter);
            --counter;
        }


        if (counter < MIN_COUNTER)
        {
            System.out.println("Dropped below minimum counter.");
        }
        else
        {
            System.out.println("Did not drop below minimum counter.");
        }

        switch (counter)
        {
            case MIN_COUNTER:
            {
                System.out.println("At MIN_COUNTER.");
                break;
            }

            case MAX_COUNTER:
            {
                System.out.println("At MAX_COUNTER.");
                break;
            }

            default:
            {
                System.out.println("Counter is: " + counter);
                break;
            }
        } // End switch (counter).

        System.out.println("Now for a couple of jokes...");
        System.out.println(getMusicJoke(SINGER_JOKE_NUMBER));
        System.out.println(getMusicJoke(GUITARIST_JOKE_NUMBER));
    }
}
