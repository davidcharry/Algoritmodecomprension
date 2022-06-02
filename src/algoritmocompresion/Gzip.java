package algoritmocompresion;

public class Gzip implements AlgoritmoCompresion {

    @Override
    public void comprimir(String filename) {
        System.out.println("creando "+filename+".gz...");
    }  
}
