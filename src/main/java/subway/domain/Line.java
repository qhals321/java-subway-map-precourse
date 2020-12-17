package subway.domain;

import subway.error.LineException;
import subway.error.LineErrorMessage;

public class Line {
    private static final int MIN_NAME_LENGTH = 2;
    private String name;

    public Line(String name) {
        if(name.length() < MIN_NAME_LENGTH) {
            throw new LineException(LineErrorMessage.SHORT_NAME);
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
