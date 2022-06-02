package algoritmocompresion;

public class Zip implements AlgoritmoCompresion{

    @Override
    public void comprimir(String filename) {
        System.out.println("creando "+filename+".zip...");  
    }
}
