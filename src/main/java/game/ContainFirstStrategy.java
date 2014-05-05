package game;

import java.util.List;

class ContainFirstStrategy extends Strategy {
    protected ContainFirstStrategy(List specialNumbers) {
        super(specialNumbers);
    }

    @Override
    public String execute(int number) {
        return first().word(first().getBase());
    }

    private SpecialNumber first() {
        return (SpecialNumber) _specialNumbers.get(0);
    }
}
