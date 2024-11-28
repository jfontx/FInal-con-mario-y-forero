package Views;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminView {
    public static void show() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("usuario: ");
        String usuario = scanner.nextLine();
        System.out.print("pass: ");
        String contraseña = scanner.nextLine();
        
        if(usuario.toLowerCase().equals("admin")&& contraseña.equals("afanador")){
            System.out.println("Bienvenido admin");
            System.out.println("");
            System.out.println("Escribe la pelicula que deseas agregar");


           
            
         }else{
            System.out.println("usuario o contraseña incorrectas");
          
        }
    
        



    }
}
