package cadenas;

public class CaracteresEspeciales {
    public static void main(String[] args) {
        //Caracteres especiales
        var cadena1 = "Hola\nMundo";
        System.out.println("cadena1 = " + cadena1);

        // \t - tabulador
        var cadena2 = "\tHola\tMundo";
        System.out.println("cadena2 = " + cadena2);

        // '\'' - agrega una comilla simple
        var cadena3 = "Hola \"Mundo\" ";
        System.out.println("cadena3 = " + cadena3);

    }
}
