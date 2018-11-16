package pl.infoshare.processing._1_strings._1_strings;

import java.util.Scanner;

public class StringExample {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        String givenCommand = getInputFromUser();

        // givenCommand.equalsIgnoreCase() ignoruje duze znaki

        if (givenCommand.trim().equals("printLine")) {
            System.out.println("I am printing as requested");
        } else if (givenCommand.equals("exit")) {
            System.exit(0);
        } else {
            System.out.println("Command " + givenCommand + " is unknown.");
        }
    }

    private static String getInputFromUser() {
        System.out.print("Please give me string: ");
        return SCANNER.nextLine();
    }
}
