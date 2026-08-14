package manejoConsola;

import java.util.Scanner;

public class ManejoConsola {
    public static void main(String[] args) {

        // Enter values from the console
        Scanner scanner = new Scanner(System.in); // in - input - entrada de datos

        System.out.print("Write your name: ");
        var name = scanner.nextLine();

        System.out.print("Write your lastname: ");
        var lastname = scanner.nextLine();

        System.out.println("Name and lastname: " + name + " " + lastname);


    }
}
