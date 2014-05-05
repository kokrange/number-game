package game;

import java.util.List;

class NoneStrategy extends Strategy{
    protected NoneStrategy(List specialNumbers) {
        super(specialNumbers);
    }

    @Override
    String execute(int number) {
        return String.valueOf(number);
    }
}
