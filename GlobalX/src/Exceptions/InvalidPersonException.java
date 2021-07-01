package Exceptions;

/**
 * Exception thrown when an invalid person is attempted
 * to be created
 */
public class InvalidPersonException extends Exception {

    /**
     * Constructs a normal InvalidPersonException with no error message or
     * cause.
     *
     * @see Exception#Exception(String)
     */
    public InvalidPersonException() {
        super();
    }

    /**
     * Constructs a normal InvalidPersonException with a helpful error message
     *
     * @param message detail message
     * @see Exception#Exception(String)
     */
    public InvalidPersonException(String message) {
        super(message);
    }
}
