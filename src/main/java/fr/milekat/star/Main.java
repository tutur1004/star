package fr.milekat.star;

import fr.milekat.star.utils.Date;
import fr.milekat.star.utils.tools;

import java.util.Scanner;

public class Main {
    private static final String DISPLAYCHAR = "*";

    public static void main(String[] args) {
        boolean continuer = true;
        do {
            Scanner scanner = new Scanner(System.in);
            log("Définissez la taille de l'étoile:");
            String input = scanner.nextLine();
            if (tools.isNumeric(input)) {
                int size = Math.round(Float.parseFloat(input));
                if (size>=1) {
                    printPatern(size);
                } else {
                    log("Merci de choisir un nombre entier suppérieur ou égual à 1.");
                }
            } else {
                log("Merci de choisir un nombre entier suppérieur ou égual à 1.");
            }
            log("Voulez vous continuer ? (Oui/Non)");
            String reponse = scanner.nextLine();
            if (reponse.equalsIgnoreCase("non")) continuer = false;
        } while (continuer);
        log("À bientôt");
    }

    public static void log(String msg) {
        System.out.println("[" + Date.setDateNow() + "] " + msg);
    }

    private static void printPatern(int n) {
        int middle = getMiddle(n);


    }

    private static void printSpaces(int nbSpaces) {
        for (int space = 1; space < nbSpaces; space++) {
            System.out.print(" ");
        }
    }

    private static int getMiddle(int n) {
        return Math.round(n*2.8f)+1;
    }

    private static void printHead(int n) {

    }

    private static void printBodyHead(int n) {

    }

    private static void printBodyDown(int n) {

    }

    private static void printDown(int n) {

    }
}
