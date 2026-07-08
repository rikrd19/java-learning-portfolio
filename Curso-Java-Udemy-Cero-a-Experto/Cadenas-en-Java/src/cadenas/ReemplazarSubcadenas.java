package cadenas;

public class ReemplazarSubcadenas {
    public static void main(String[] args) {

        // Remplazar subcadenas
        var cadena = "Hola Nuevo Mundo";
        System.out.println("\ncadena original = " + cadena);

        // Reemplazar "Mundo" por "a todos"
        var nuevaCadena = cadena.replace("Mundo", "a todos");
        System.out.println("nuevaCadena = " + nuevaCadena);

        // reemplazar de "Hola" por "Adios"
        nuevaCadena = cadena.replace("Hola", "Adios");
        System.out.println("nuevaCadena = " + nuevaCadena);


    }
}
