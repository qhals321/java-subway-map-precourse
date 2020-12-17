package subway.error;

public class LineException extends RuntimeException {

    public LineException(LineErrorMessage shortName) {
        super(shortName.getMessage());
    }
}
