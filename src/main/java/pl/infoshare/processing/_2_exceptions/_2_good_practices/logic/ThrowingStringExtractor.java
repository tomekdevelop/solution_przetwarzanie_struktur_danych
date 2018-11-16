package pl.infoshare.processing._2_exceptions._2_good_practices.logic;

public class ThrowingStringExtractor {

    public char extractOrThrow(String string) throws InvalidStringLengthException {
        if (string.length() < 5) {
            throw new InvalidStringLengthException();
        }

        return string.charAt(5);
    }
}
