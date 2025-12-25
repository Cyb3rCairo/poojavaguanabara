import java.nio.channels.Pipe.SourceChannel;

public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Carlinhos");
        v[1] = new Video("Comi o frango");
        v[2] = new Video("Num sei");
        
        Gafanhoto g[]= new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "Juba");
        g[1] = new Gafanhoto("Creuza", 48, "F", "Creuza2");

        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
    }
}
