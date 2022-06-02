package algoritmocompresion;

public class Rar implements AlgoritmoCompresion {

    @Override
    public void comprimir(String filename) {
        System.out.println("creando "+filename+".rar...");       
    }   
}
