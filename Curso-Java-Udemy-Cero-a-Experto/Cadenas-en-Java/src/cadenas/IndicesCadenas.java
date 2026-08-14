package cadenas;

public class IndicesCadenas {
    public static void main(String[] args) {

        // manejo de indices en una cadena
        var cadena1 = "Hola Mundo";


        // recuperar   el primer caracter
        var primerCaracter = cadena1.charAt(0);
        var segundoCaracter = cadena1.charAt(1);
        var tercerCaracter = cadena1.charAt(2);
        var cuartoCaracter = cadena1.charAt(3);
        var quintoCaracter = cadena1.charAt(4);
        var OctavoCaracter = cadena1.charAt(7);

        var decimoCaracter = cadena1.charAt(9);

        System.out.println("Primer caracter: " + primerCaracter);
        System.out.println("Segundo caracter: " + segundoCaracter);
        System.out.println("Tercer caracter: " + tercerCaracter);
        System.out.println("Cuarto caracter: " + cuartoCaracter);
        System.out.println("Octavo caracter: " + OctavoCaracter);

        System.out.println("Decimo caracter: " + decimoCaracter);


        System.out.println("\n*** Recuperar el ultimo caracter de una cadena en la posicion 9");
        var letra_M = cadena1.charAt(5);
        System.out.print("Letra 'M': " + letra_M);




    }






}
