package lotto;

import java.util.Collections;
import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }// Lotto

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        } // if
    }//validate

    public List<Integer> getLottoNumbers() {
        Collections.sort(numbers);
        return numbers;
    }//getLottoNumbers
}// end class
