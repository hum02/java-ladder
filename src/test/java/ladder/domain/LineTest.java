package ladder.domain;

import ladder.FixedLineStrategy;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class LineTest {
    @Test
    @DisplayName("LineStrategy로부터 line을 생성한다.")
    void line_generateFromLineStrategy() {
        // given
        List<List<Boolean>> parts = List.of(List.of(true, false, true, false));
        FixedLineStrategy fixedLineStrategy = new FixedLineStrategy(parts);

        // when
        Line line = new Line(fixedLineStrategy, 4);

        // expected
        Assertions.assertThat(line.getLine()).containsExactly(true, false, true, false);
    }
}
