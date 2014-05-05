package game;

import java.util.List;

class StrategyFactory {
    static Strategy create(List specialNumbers, int number) {
        if (containsFirst(specialNumbers, number))
            return new ContainFirstStrategy(specialNumbers);
        if (divisible(specialNumbers, number))
            return new DivisibleStrategy(specialNumbers);
        else
            return new NoneStrategy(specialNumbers);
    }

    private static boolean divisible(List specialNumbers, int number) {
        for (int i = 0; i < specialNumbers.size(); i++) {
            SpecialNumber specialNumber = (SpecialNumber) specialNumbers.get(i);
            if (specialNumber.isDivisible(number)) return true;
        }
        return false;
    }

    private static boolean containsFirst(List specialNumbers, int number) {
        return (String.valueOf(number)).contains(String.valueOf(firstOf(specialNumbers)));
    }

    private static int firstOf(List specialNumbers) {
        return ((SpecialNumber) specialNumbers.get(0)).getBase();
    }
}
