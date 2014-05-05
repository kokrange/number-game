package game;

class SpecialNumber {
    private int _base;
    private String _word;

    SpecialNumber(int base, String word) {
        _base = base;
        _word = word;
    }

    int getBase() {
        return _base;
    }

    String word(int number) {
        return isDivisible(number)
                ? _word
                : "";
    }

    boolean isDivisible(int number) {
        return 0 == number % _base;
    }
}
