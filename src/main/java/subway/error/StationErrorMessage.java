package subway.error;

public enum StationErrorMessage {
    SHORT_NAME("이름은 두 글자 이상이어야합니다.");

    private final String message;

    StationErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
