package Objects;

import Views.SalasView;
import helpers.GeneralHelper;

public class Sala {
    public String name;
    public int [][] sillas;

    public Sala(String name, int[][] sillas){
        this.name=name;
        this.sillas=sillas;
    }

    public static Sala buildSala(int numberSala){
        String[] content = GeneralHelper.readFile("resources/salas/sala"+ numberSala+".txt").split("\n");
        String nameSala = "sala"+numberSala;
        int sillas[][] = new int [content.length-1][content[0].split(",").length];
        for (int i = 1; i < content.length; i++) {
            String[] info = content[i].split(",");
            String silla = info[0];
            System.out.print(silla);
            for(int k=0; k<info.length; k++){
                sillas[i-1][k]=Integer.parseInt(info[k]);
                
            }
            
        }
      return new Sala(nameSala, sillas);
    }
    public void updateSillas(int fila, int columna){
        sillas[fila][columna]=1;
    }
}
