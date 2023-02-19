package ladder.domain;

import ladder.utils.LineStrategy;

import java.util.Collections;
import java.util.List;

public class Line {
    private final List<Boolean> sections;

    public Line(LineStrategy lineStrategy, int sectionCount) {
        this.sections = lineStrategy.generate(sectionCount);
    }

    public List<Boolean> getLine() {
        return Collections.unmodifiableList(sections);
    }

    public int moveFrom(int startPosition) {
        validateOutBound(startPosition);
        if (startPosition == sections.size()) {
            return startPosition;
        }
        if (sections.get(startPosition) == true) {
            return startPosition + 1;
        }
        return startPosition;
    }

    private void validateOutBound(int startPoint) {
        if (startPoint < 0 || startPoint > sections.size()) {
            throw new IllegalArgumentException("line 범위 밖의 시작점입니다.");
        }
    }
}
