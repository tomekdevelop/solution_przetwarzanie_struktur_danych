package pl.infoshare.processing._1_strings._3_exercise;

import java.util.List;

public class StringsExercise {

    // TODO: Z listy stringów poniżej znajdź te które:
    // TODO: * Zaczynają się dowolną ilością wielkich liter
    // TODO: * kończą się wyrażeniem 'JO'
    // TODO: * przed wyrażeniem 'JO' posiadają maksymalnie 3 cyfry
    // TODO: * białe znaki na początku i z tyłu stringów powinny zostać zignorowane
    // TODO: Wypisz wszystkie Stringi spełniające warunek oraz ile ich było
    public static void main(String[] args) {
        StringProvider stringProvider = new StringProvider();
        List<String> testStrings = stringProvider.getTestStrings();


        int counter = 0;

        for (String testString : testStrings) {

            if(testString.matches("[A-Z]*\\d{0,3}JO")){
                System.out.println(testString);
                counter++;
            }
        }

        System.out.println(counter);

    }
}
