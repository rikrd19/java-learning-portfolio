package ws.ricardo_avila.com;

import java.util.Scanner;

public class EjercicioValidadorPassword {
    
public static boolean esPasswordValida(String password){
  return password.length() >= 8;
   
}

    public static void main(String[] args) {
        System.out.println("***** Validador de Password *****");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese su contraseña: ");
        String password = scanner.nextLine();

        if (esPasswordValida(password)) {
            System.out.println("Contraseña válida.");
        } else {
            System.out.println("Contraseña inválida. Minimo 8 caracteres.");
        }
        

    }

}
