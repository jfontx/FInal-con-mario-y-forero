package Views;

import java.util.ArrayList;
import java.util.Scanner;

import Objects.Movie;
import Objects.ShareMemory;

public class AdminView {
    public static void show() {
        int answer = 1;
        Scanner newscanner = new Scanner(System.in);
        System.out.print("usuario: ");
        String usuario = newscanner.nextLine();
        System.out.print("pass: ");
        String contraseña = newscanner.nextLine();

        while (answer == 1) {
            Scanner scanner = new Scanner(System.in);
            if (usuario.toLowerCase().equals("admin") && contraseña.equals("afanador")) {
                System.out.print("Bienvenido admin\n");
                System.out.print("Escribe la pelicula que deseas agregar: ");
                String name = scanner.nextLine();
                System.out.print("ingrese la duracion de la pelicula en minutos: ");
                int time = scanner.nextInt();
                Movie movie = new Movie(name, time);
                ShareMemory.addMovie(movie);

                 ShareMemory.printAllMovies();

                 System.out.println("quieres salir?");
                 System.out.println("1. Si");
                 System.out.println("2. No");
                 answer = scanner.nextInt();
                 if (answer==1) {
                    break;
                    
                 }else if(answer==2){
                    answer=1;
                 }

            } else if (!usuario.toLowerCase().equals("admin") && !contraseña.equals("afanador")) {
                System.out.println("usuario o contraseña incorrectas");

            }
        }
    }
}
