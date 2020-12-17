package subway.error;

public enum LineErrorMessage {
    SHORT_NAME("이름은 두 글자 이상이어야합니다.");

    private final String message;

    LineErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
