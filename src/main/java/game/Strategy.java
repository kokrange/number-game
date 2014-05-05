package game;

import java.util.List;

abstract class Strategy {
    protected List _specialNumbers;

    protected Strategy(List specialNumbers) {
        _specialNumbers = specialNumbers;
    }

    abstract String execute(int number);
}
