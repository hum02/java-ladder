package ladder.domain;

import ladder.FixedLineStrategy;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LadderTest {

    @ParameterizedTest
    @CsvSource(value = {"0:2", "1:0", "2:3", "3:1"}, delimiter = ':')
    @DisplayName("첫 층 라인에서 사다리를 따라 마지막 라인의 도착점을 계산한다.")
    void ladder_moveThrough(int start, int expected) {
        //given
        List<List<Boolean>> lines = List.of(List.of(true, false, true), List.of(false, true, false));
        Ladder ladder = new Ladder(4, 2, new FixedLineStrategy(lines));
        // |--|  |--|
        // |  |--|  |

        // when
//        int arrived = ladder.moveThrouh(new Position(start));

        //then
//        Assertions.assertThat(arrived).isEqualTo(expected);
    }


}