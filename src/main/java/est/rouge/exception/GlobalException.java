package est.rouge.exception;

import lombok.Getter;

/**
 * Class represents for global exception
 * 
 * @author ngocnguyen
 */
@SuppressWarnings("serial")
@Getter
public class GlobalException extends Exception {
    /**
     * Message content
     */
    private String message;

    /**
     * Constructor
     * 
     * @param message
     *            message content
     */
    public GlobalException(String message) {
        this.message = message;
    }
}
