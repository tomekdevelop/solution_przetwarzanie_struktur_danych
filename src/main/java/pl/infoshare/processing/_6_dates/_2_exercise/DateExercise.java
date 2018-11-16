package pl.infoshare.processing._6_dates._2_exercise;

import sun.util.calendar.BaseCalendar;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class DateExercise {

    private static final Scanner SCANNER = new Scanner(System.in);

    // TODO: Exercise - Java 8 dates
    // TODO: Napisz prostą aplikację która będzie przyjmować od użytkownika w formacie 31-12-1900 datę oraz liczbę dni jaka do daty dodać
    // TODO: Następnie po dodaniu sprawdzi jaki jest to miesiąc, czy jest to weekend oraz czy rok jest przestępny
    // TODO: Wypisz informację ile tygodni jest pomiędzy datami
    // TODO: Na sam koniec wypisze obliczoną datę w formacie 1900-31-Dec

    //ChronoUnit


    public static void main(String[] args) {

    String data = getInputFromUser();
    int number = Integer.valueOf(getInputFromUser());

       DateTimeFormatter format =  DateTimeFormatter.ofPattern("dd-MM-yyyy");
       LocalDate userDate = LocalDate.parse(data, format);  // parsuje stringa na date

       System.out.println(userDate);

       LocalDate userDatePlus =  userDate.plusDays(number);
        System.out.println(userDatePlus);


        System.out.println(userDatePlus.getMonth());

        DayOfWeek dayOfWeek =   userDatePlus.getDayOfWeek();

        if(dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY){  /// equals porownujemy obiekty a == zmienne
            System.out.println("Jest weekend !!! :) " + dayOfWeek);
        }else {
            System.out.println("Nie ma weekendu :(");
        }

        boolean leapYear = userDatePlus.isLeapYear();

        if (leapYear){
            System.out.println("Jest przestepny");
        }else {
            System.out.println("nie jest przestepny");
        }

        long beetween = ChronoUnit.WEEKS.between(userDate, userDatePlus);
        System.out.println(beetween);


        System.out.println(userDatePlus.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));


//        System.out.println(parse);

//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
//        LocalDate parse2 = LocalDate.parse(data, formatter);

//        System.out.println(parse2);
    }

    private static String getInputFromUser() {
        System.out.print("Please give me string: ");
        return SCANNER.nextLine();
    }
}
