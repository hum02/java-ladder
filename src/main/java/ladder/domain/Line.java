package ladder.domain;

import ladder.utils.LineStrategy;

import java.util.Collections;
import java.util.List;

public class Line {
    private static final boolean LINKED = true;
    private final List<Boolean> bridges;

    public Line(LineStrategy lineStrategy, int sectionCount) {
        this.bridges = lineStrategy.generate(sectionCount);
    }

    public int moveFrom(int startPosition) {
        validateOutBound(startPosition);
        if (isRightMoveAble(startPosition) && (bridges.get(startPosition) == LINKED)) {
            return startPosition + 1;
        }
        if (isLeftMoveAble(startPosition) && (bridges.get(startPosition - 1) == LINKED)) {
            return startPosition - 1;
        }
        return startPosition;
    }

    private boolean isRightMoveAble(int position) {
        return position + 1 <= bridges.size();
    }

    private boolean isLeftMoveAble(int position) {
        return position - 1 >= 0;
    }

    public List<Boolean> getLine() {
        return Collections.unmodifiableList(bridges);
    }

    private void validateOutBound(int startPoint) {
        if ((startPoint < 0) || (startPoint > bridges.size())) {
            throw new IllegalArgumentException("line 범위 밖의 시작점입니다.");
        }
    }
}
