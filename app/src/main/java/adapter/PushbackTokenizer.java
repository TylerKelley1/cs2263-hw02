/**
 * @author Tyler Kelley
 * @author CS2263 Homework 2 Isaac Griffith
 * @version 2.1.0
 * @since 1.0.0
 */
package adapter;

/**
 * Pushbacktokenizer class used for implementing tests on methods
 */
public interface PushbackTokenizer {
    //returns the next token
    String nextToken();
    //returns true iff there are more tokens
    boolean hasMoreTokens();
    //the token read is pushed back so it can be read again using nextToken
    void pushBack();
}
