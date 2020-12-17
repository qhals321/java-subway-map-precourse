package subway.error;

public class StationException extends RuntimeException {
    public StationException(StationErrorMessage stationErrorMessage) {
        super(stationErrorMessage.getMessage());
    }
}
