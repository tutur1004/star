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
            log("Voulez vous continuer le programme ? (O/N)");
            String reponse = scanner.nextLine();
            if (reponse.equalsIgnoreCase("n")) continuer = false;
        } while (continuer);
        log("À bientôt.");
    }

    /**
     *      Logger avec date !
     */
    public static void log(String msg) {
        System.out.println("[" + Date.setDateNow() + "] " + msg);
    }

    /**
     *      Création & affichage de l'étoile
     * @param size taille de l'étoile
     */
    private static void printPatern(int size) {
        int middle = getMiddle(size);
        int largeur = middle*2+1;
        //  Tête
        printHead(size, middle);
        //  Première ligne horizontale
        printCenterLine(size, middle, largeur);
        //  Corp supérieur
        printBodyHead(size, largeur);
        // ligne du centre
        printSpaces(size);
        System.out.print(DISPLAYCHAR);
        printSpaces((middle-size-1)+1+(middle-size-1));
        System.out.println(DISPLAYCHAR);
        //  Corp inférieur
        printBodyDown(size, largeur);
        //  Seconde ligne horizontale
        printCenterLine(size, middle, largeur);
        //  Tête inférieure
        printDown(size, middle);
        System.out.println();
    }

    /**
     *      Fonction pour print x espace(s) sur la ligne en cours
     */
    private static void printSpaces(int nbSpaces) {
        for (int space = 0; space < nbSpaces; space++) {
            System.out.print(" ");
        }
    }

    /**
     *      Fonction pour récupérer le nombre de chars avant le centre de l'étoile
     */
    private static int getMiddle(int n) {
        return Math.round(n*2.8f);
    }

    /**
     *      Affichage de la tête de l'étoile
     */
    private static void printHead(int n, int middle) {
        // Cursor en haut
        printSpaces(middle);
        System.out.print(DISPLAYCHAR);
        // i lignes
        for (int i = 1;i<n;i++) {
            System.out.println();
            printSpaces(middle-i);
            System.out.print(DISPLAYCHAR);
            printSpaces((i*2)-1);
            System.out.print(DISPLAYCHAR);
        }
        System.out.println();
    }

    /**
     *      Affichage de la partie horizontale (Affichée 2 fois)
     */
    private static void printCenterLine(int n, int middle, int largeur) {
        for (int i = 0;i<largeur;i++) {
            if (i <= middle-n || i >= largeur-middle+n-1) {
                System.out.print(DISPLAYCHAR);
            } else {
                printSpaces(1);
            }
        }
        System.out.println();
    }

    /**
     *      Affichage du corp supérieur de l'étoile
     */
    private static void printBodyHead(int n, int largeur) {
        for (int i = 1;i<n;i++) {
            printSpaces(i);
            System.out.print(DISPLAYCHAR);
            printSpaces(largeur-2-i*2);
            System.out.print(DISPLAYCHAR);
            System.out.println();
        }
    }

    /**
     *      Affichage du corp inférieur de l'étoile
     */
    private static void printBodyDown(int n, int largeur) {
        for (int i = n;i>1;i--) {
            printSpaces(i-1);
            System.out.print(DISPLAYCHAR);
            printSpaces(largeur-i*2);
            System.out.print(DISPLAYCHAR);
            System.out.println();
        }
    }

    /**
     *      Affichage de la 'tête' inférieure de l'étoile
     */
    private static void printDown(int n, int middle) {
        // i lignes
        for (int i = n; i > 0; i--) {
            printSpaces(middle - i + 1);
            System.out.print(DISPLAYCHAR);
            if (i>1) {
                printSpaces(i*2-3);
                System.out.print(DISPLAYCHAR);
                System.out.println();
            }
        }
    }
}
