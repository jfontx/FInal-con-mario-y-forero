import Objects.ShareMemory;
import Views.InitialView;

public class App {
    
    public static void main(String[] args) throws Exception {
        ShareMemory.buildSalas();
        ShareMemory.buildMovies();
        while (true) {
        InitialView.show();
        
            
        }

        
    }
}
