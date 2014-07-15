package game;

public class SpecialNumber {
    private int _base;
    private String _word;

    SpecialNumber(int base, String word) {
        _base = base;
        _word = word;
    }


    public String word(int number) {
        return isDivisible(number)
                ? _word
                : "";
    }

    public  String bareWord() {
        return word(_base);
    }

    public boolean contains(int number) {
        return String.valueOf(number).contains(String.valueOf(_base));
    }


    public boolean isDivisible(int number) {
        return 0 == number % _base;
    }
}
