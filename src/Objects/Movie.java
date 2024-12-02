package Objects;

public class Movie {
    String name;
    int duracion;

    public Movie(String name, int duracion){
        this.name= name;
        this.duracion=duracion;

    }

    public void printMovie(){
        System.out.println("["+this.name + "," + this.duracion + "]");
    }
}

