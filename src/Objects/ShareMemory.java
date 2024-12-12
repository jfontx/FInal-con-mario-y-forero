package Objects;

import java.util.ArrayList;

import Views.SalasView;
import helpers.GeneralHelper;

public class ShareMemory {
    public static ArrayList<Movie> movies = new ArrayList<>();
    public static ArrayList<Sala> salas = new ArrayList<>();

    public static void addMovie(Movie movie) {
        movies.add(movie);
    }

    public static void printAllMovies() {
        for (Movie movie : movies) {
            movie.printMovie();
        }
    }

    public static void buildMovies() {
        String[] content = GeneralHelper.readFile("peliculas.txt").split("\n");
        for (int i = 1; i < content.length; i++) {
            String[] info = content[i].split(",");
            String name = info[0];
            int time = Integer.parseInt(info[1]);
            Movie movie = new Movie(name, time);
            addMovie(movie);

        }

    }

    public static void buildSalas(){
        for(int i=0; i<2; i++){
           salas.add( Sala.buildSala(i+1));
        }


    }
}
