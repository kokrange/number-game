package game;

import game.strategy.Strategy;
import game.strategy.StrategyFactory;

import java.util.*;

class Student {
    private int _number;
    private Strategy _strategy;

    Student(List specialNumbers, int number) {
        _number = number;
        _strategy = StrategyFactory.create(specialNumbers, number);
    }

    String numberOff() {
        return _strategy.execute(_number);
    }
}
