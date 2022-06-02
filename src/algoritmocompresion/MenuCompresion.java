package algoritmocompresion;

import java.util.Scanner;

public class MenuCompresion {

    AlgoritmoCompresion algorithm;
    static Scanner sc = new Scanner(System.in);

    private void menu() {
        System.out.println("Seleccione una opción");
        System.out.println("1) para comprimir el archivo en zip");
        System.out.println("2) para comprimir el archivo en rar");
        System.out.println("3) para comprimir el archivo en gz");
        int opc = Integer.parseInt(sc.nextLine());
        System.out.println("Digite el nombre del archivo:");
        String filename = sc.nextLine();
        switch (opc) {
            case 1:
                algorithm = new Zip();
                break;
            case 2:
                algorithm = new Rar();
                break;
            case 3:
                algorithm = new Gzip();
                break;
        }
        algorithm.comprimir(filename);
    }

    public static void main(String[] args) {
        MenuCompresion cm = new MenuCompresion();
        cm.menu();
    }
}
