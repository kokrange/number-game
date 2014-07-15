package game.strategy;

import java.util.List;

public abstract class Strategy {
    protected List _specialNumbers;

    protected Strategy(List specialNumbers) {
        _specialNumbers = specialNumbers;
    }

    public abstract String execute(int number);
}
