package subway.domain;

import subway.error.StationErrorMessage;
import subway.error.StationException;

public class Station {
    private static final int MIN_NAME_LENGTH = 2;
    private static final int INIT_LINE_COUNT = 0;
    private String name;
    private int lineCount = INIT_LINE_COUNT;

    public Station(String name) {
        if (name.length() < MIN_NAME_LENGTH) {
            throw new StationException(StationErrorMessage.SHORT_NAME);
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void upLineCount() {
        lineCount++;
    }

    public void downLineCount() {
        lineCount--;
    }

    public boolean isRemovable() {
        return INIT_LINE_COUNT == lineCount;
    }
}
