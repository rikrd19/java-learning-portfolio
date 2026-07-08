package cadenas;

public class Cadenas {

    public static void main(String[] args) {


        System.out.println("*** Manejo de cadenas en Java ***");
        var cadena1 = "hola";
        var cadena2 = new String("mundo");
        var cadena3 = cadena1 + " " + cadena2;

        var cadena4 = """
        This
        is a text
        multiline
        plus more
        lines
        """;

        System.out.println("String 1 = " + cadena1);
        System.out.println("String 2 = " + cadena2);
        System.out.println("String 3 = " + cadena3);
        System.out.println(cadena4);

    }


}