package file_handling;

public class MarriageException extends RuntimeException {
    String message;

    public MarriageException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
