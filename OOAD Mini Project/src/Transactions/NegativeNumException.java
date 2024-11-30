package Transactions;
import java.io.IOException;
import java.lang.IllegalArgumentException;

public class NegativeNumException extends RuntimeException {
    public NegativeNumException(String message) {
        super(message);
    }
}
