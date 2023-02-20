package ladder;

import ladder.domain.Command;
import ladder.domain.LadderGame;
import ladder.utils.RandomDiscreteStrategy;
import ladder.view.InputView;
import ladder.view.OutputView;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        final var lineStrategy = new RandomDiscreteStrategy();
        Command command = readCommand();

        LadderGame game = new LadderGame(command, lineStrategy);
        OutputView.printLadder(game.getPlayerNames(), game.getLadder(), game.getResults());
    }

    private static Command readCommand() {
        List<String> names = InputView.readNames();
        List<String> results = InputView.readResults();
        int height = InputView.readLadderHeight();
        return new Command(names, results, height);
    }
}
