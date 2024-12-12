package Views;

import java.util.Scanner;

public class InitialView {

    public static void show() {
        System.out.println("Bienvenido al cine! selecciona una opcion:");
        System.out.println("");
        System.out.println("1. Administrador");
        System.out.println("2. cliente");
        System.out.println("3. salir");

        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
            System.out.println("");
            System.out.println("Ingresa el usuario y contraseña");
            AdminView.show();
                
                break;
            case 2:
            System.out.println("");
            System.out.println("Hola Cliente");
            System.out.println("");
            CarteleraView.show();

                break;
            case 3:
            System.out.println("");
            System.out.println("saliste exitosamente");
            System.exit(0);
                break;
            default:
            System.out.println("Seleccione un numero dentro de las opciones disponibles");

                break;
        }
        

    }
}