package Model;


import java.util.*;

public class Util {

    public static String ingresarTexto(String mensaje){
        Scanner scanner = new Scanner (System.in);
        System.out.println(mensaje);
        return scanner.nextLine();
    }

    public static int ingresarEntero(String mensaje){
        Scanner scanner = new Scanner (System.in);
        System.out.println(mensaje);
        return scanner.nextInt();
    }

    public static byte ingresarByte(String mensaje){
        Scanner scanner = new Scanner (System.in);
        System.out.println(mensaje);
        return scanner.nextByte();
    }
}
