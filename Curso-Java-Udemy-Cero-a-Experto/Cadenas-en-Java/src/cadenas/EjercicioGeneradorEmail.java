package cadenas;

public class EjercicioGeneradorEmail {
    public static void main(String[] args) {

        var nombreCompleto = "   Ubaldo Acosta Soto    ".strip();
        var nombreNormalizado = nombreCompleto.replace(" ",".").toLowerCase();
        var nomEmpresa = "Global Mentoring";
        var nomEmpresaNormalizado = nomEmpresa.strip().replace(" ","").toLowerCase();
        var ExtDominio = ".com.mx";

        var email = "@globalmentoring"+ ExtDominio;
        var correo = nombreNormalizado+ email;

        System.out.println("\n***Generador de email ***");
        System.out.println("Nombre usuario: " + nombreCompleto);
        System.out.println("Nombre usuario normalizado: " + nombreNormalizado);
        System.out.println("\n");
        System.out.println("Nombre empresa: " + nomEmpresa);
        System.out.println("Extensión del dominio: " + ExtDominio);
        System.out.println("Dominio de email normalizado: " + email);
        System.out.println("\n");
        System.out.println("Email final generado: " + correo);
    }
}
