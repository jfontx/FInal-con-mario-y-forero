package Views;


import java.util.Scanner;
public class CarteleraView {
    public static void show() { 
        System.out.println("");
        System.out.println("1. los avenger");
        System.out.println("2. dedpool");
        System.out.println("3. amerikan pie");
        System.out.println("4. teriffier");
        
        Scanner scanner = new Scanner(System.in);
        int opcionPeli = scanner.nextInt();
        
        
        if (opcionPeli<0 || opcionPeli>4){
            System.out.println("Seleccione una de las opciones disponibles");
        }

        


    







    }

    
}
