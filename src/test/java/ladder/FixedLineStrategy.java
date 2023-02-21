package ladder;

import ladder.utils.LineStrategy;

import java.util.List;

public class FixedLineStrategy implements LineStrategy {
    private final List<List<Boolean>> lines;
    private int generateCount;

    public FixedLineStrategy(List<List<Boolean>> line) {
        this.lines = line;
        this.generateCount = 0;
    }

    @Override
    public List<Boolean> generate(int bridgeCount) {
        List<Boolean> line = lines.get(generateCount);
        generateCount = generateCount + 1;
        return line;
    }
}
