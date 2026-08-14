package cadenas;

public class BusquedaSubcadenas {
    public static void main(String[] args) {

        // buscar subcadenas
        //indexOf() devuelve el indice de la primera ocurrencia de la subcadena, o -1 si no se encuentra
       var cadena1 = "Hola Nuevo Mundo Mundo";

       // subcadena a buscar "Hola"
        var indice1 = cadena1.indexOf("Nuevo");
        System.out.println("indice1 = " + indice1);

        // lastIndexOf() devuelve el indice de la ultima aparicion de la subcadena
        // subcadena a buscar "Mundo"
        var indice2 =  cadena1.lastIndexOf("Mundo");
        System.out.println("subcadena2 = " + indice2);

        // para la subcadena no encontrada devuelve -1 --> indexOf()
        var indice3 = cadena1.indexOf("Java");
        System.out.println("indice3 = " + indice3);

        // para la subcadena no encontrada devuelve -1 --> lastIndexOf()
        var indice4 = cadena1.lastIndexOf("Java");
        System.out.println("indice4 = " + indice4);


    }

}
