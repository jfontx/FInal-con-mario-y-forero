package Views;


import java.util.ArrayList;
import java.util.Scanner;

import Objects.Movie;
import Objects.ShareMemory;
public class CarteleraView {
    public static void show() { 
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresa tu nombre");
        String nombreUsuario = scanner.nextLine();
        System.out.println("");


        for(int i=0; i<ShareMemory.movies.size(); i++){
            System.out.println((i+1)+". "+ShareMemory.movies.get(i).name);
        
        }

        System.out.println("");

        System.out.println("Hola "+ nombreUsuario + " "+ "Selecciona el numero de la pelicula que deseas ver");
        int opcionPeli = scanner.nextInt();
        Movie movieSelected = ShareMemory.movies.get(opcionPeli-1);
        System.out.println("");
        System.out.println("has escogido la pelicula:"+ "" + movieSelected.name);
        
        SalasView.show();
  
        
         
        

        


    







    }

    
}
