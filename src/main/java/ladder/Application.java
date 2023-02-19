package ladder;

import ladder.domain.LadderGame;
import ladder.utils.RandomDiscreteStrategy;
import ladder.view.InputView;
import ladder.view.OutputView;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        final var lineStrategy = new RandomDiscreteStrategy();
        List<String> names = InputView.readNames();
        int height = InputView.readLadderHeight();
        LadderGame game = new LadderGame(names, height, lineStrategy);
        OutputView.printLadder(game.getPlayerNames(), game.getLadder(), game.getNameMaxLength());
    }
}
