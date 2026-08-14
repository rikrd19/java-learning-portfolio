package cadenas;

public class ManejoSubcadenas {
    public static void main(String[] args) {

        //tema de subcadenas
        // substring(indiceInicial, indiceFinal)

        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);

        // subcadena
        var subcadena1 = cadena1.substring(0, 4);
        System.out.println("subcadena1 = " + subcadena1);
        System.out.println("subcadena2 = " + cadena1.substring(5, 10));
        System.out.println("subcadena2 = " + cadena1.substring(5));







    }
}
