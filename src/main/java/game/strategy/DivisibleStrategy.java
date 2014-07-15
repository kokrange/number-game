package game.strategy;

import game.SpecialNumber;

import java.util.List;

class DivisibleStrategy extends Strategy{
    protected DivisibleStrategy(List specialNumbers) {
        super(specialNumbers);
    }

    @Override
    public String execute(int number) {
        String words = "";
        for (int i = 0; i < _specialNumbers.size(); i++) {
            SpecialNumber specialNumber = (SpecialNumber) _specialNumbers.get(i);
            words += specialNumber.word(number);
        }
        return words;
    }
}
