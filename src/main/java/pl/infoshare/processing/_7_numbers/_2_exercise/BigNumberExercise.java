package pl.infoshare.processing._7_numbers._2_exercise;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigNumberExercise {


    // TODO: Exercise - numbers
    // TODO: Napisz prosty kalkulator pozwalający na podstawowe operacje na dwóch liczbach oraz odwrócenie znaku jednej liczby
    // TODO: Należy pamiętać o poprawności wykonywanych działań
    // TODO: Na sam koniec sprawdzić czy wynik wynosi 1 lub 10 i jeżeli tak wypisać stosowaną informację na ekran
    public static void main(String[] args) {


        BigDecimal bigX = BigDecimal.valueOf(7.4);
        BigDecimal bigY = BigDecimal.valueOf(7.98);

        System.out.println(bigX+" + "+bigY+ " = " + bigX.add(bigY));
        System.out.println(bigX+" - "+bigY+ " = " + bigX.subtract(bigY));
        System.out.println(bigX+" * "+bigY+ " = " + bigX.multiply(bigY));
        System.out.println(bigX+" / "+bigY+ " = " + bigX.divide(bigY, 2, RoundingMode.HALF_UP)); // RoundingMode.HALF_UP zaokragla


        System.out.println(String.format("My name is %s and ma age is %s", "Tomek", bigX));

        if (bigX.compareTo(bigY) == 0){
            System.out.println("Equals");
        }else {
            System.out.println("Not equals");
        }



    }
}
