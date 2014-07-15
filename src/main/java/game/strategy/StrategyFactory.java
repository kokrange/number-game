package game.strategy;

import game.SpecialNumber;

import java.util.List;

public class StrategyFactory {
    public static Strategy create(List specialNumbers, int number) {
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
        return first(specialNumbers).contains(number);
    }

    private static SpecialNumber first(List specialNumbers) {
        return (SpecialNumber) specialNumbers.get(0);
    }
}
