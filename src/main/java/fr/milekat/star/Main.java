package fr.milekat.star;

import fr.milekat.star.utils.Date;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        log("Définissez la taille de l'étoile:");
        int size = myInput.nextInt();
        
    }

    public static void log(String msg) {
        System.out.print("[" + Date.setDateNow() + "] " + msg);
    }
}
