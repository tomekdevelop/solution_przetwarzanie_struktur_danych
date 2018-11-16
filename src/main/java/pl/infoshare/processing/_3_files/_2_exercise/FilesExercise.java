package pl.infoshare.processing._3_files._2_exercise;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FilesExercise {

    // TODO: Ćwiczenie - Files:
    // TODO: 1. Stwórz plik tymczasowy, zapisz do niego pierwszą część lorem ipsum pobraną z LoremProvider
    // TODO: 2. Skopiuj plik do projektu do folderu paths/custom. Nazwa pliku: lorem.txt
    // TODO: 4. Usuń plik tymczasowy
    // TODO: 5. Sprawdź i wypisz informację o tym czy plik tymczasowy istnieje
    // TODO: 6. Odczytaj zawartość pliku lorem.txt i wypisz zawartość na ekran
    // TODO: 7. Dopisz do pliku lorem.txt drugą część lorem ipsum
    // TODO: 8. Odczytaj zawartość pliku lorem.txt, wypisz linijki 3, 6, 8 na ekran
    public static void main(String[] args) {

        LoremProvider loremProvider = new LoremProvider();


        List<String>firstPartOfLorem = loremProvider.getFirstPartOfLorem();
        List<String>secondPartOfLorem = loremProvider.getSecondPartOfLorem();

        loremProvider.getFirstPartOfLorem();

        try {
            Path tempFile = Files.createTempFile("loremFile", ".txt"); // 1
            Files.write(tempFile, firstPartOfLorem);                                // 1
            Path myPaths = Paths.get("paths", "custom", "lorem.txt");
            Files.copy(tempFile, myPaths);                                          //2
//            Files.delete(tempFile);                                               //4

            System.out.println(Files.exists(tempFile));                             //5 true lub false

            System.out.println(Files.readAllLines(myPaths));                        //6

            Files.write(myPaths, secondPartOfLorem , StandardOpenOption.APPEND);                                //7  StandardOpenOption.APPEND dopisuje juz do istniejacej zawartosci

            System.out.println(Files.readAllLines(myPaths));

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
