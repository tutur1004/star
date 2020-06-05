package fr.milekat.star;

import fr.milekat.star.utils.Date;
import fr.milekat.star.utils.tools;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean continuer = true;
        do {
            Scanner scanner = new Scanner(System.in);
            log("Définissez la taille de l'étoile:");
            String input = scanner.nextLine();
            int size = 0;
            if (tools.isNumeric(input)) {
                size = Math.round(Float.parseFloat(input));
                log(size + "");
            } else {
                log("Merci de choisir un nombre entier suppérieur à 0.");
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
}
