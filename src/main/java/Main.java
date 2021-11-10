import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ejecutarMenu();
    }

    public static void mostrarMenu(){
        System.out.println("-------------------Ingrese una opción----------------------");
        System.out.println("***********************************************************");
        System.out.println("*                       MENÚ                              *");
        System.out.println("[1]Agregar o Eliminar Producto");
        System.out.println("[2]Agregar nuevos Camiones a la flota");
        System.out.println("[3]Eliminar Camiones de la flota");
        System.out.println("[4]Calcular el Valor total del Embarque");
        System.out.println("[0]Salir");
        System.out.println("***********************************************************");
    }
    public static void ejecutarMenu(){
        Scanner teclado = new Scanner(System.in);
        int aux=0;
        do {
            mostrarMenu();
            String opcion = teclado.next();
            switch (opcion) {
                case "1" -> {


                    break;
                }
                case "2" -> {
                    break;
                }
                case "3" -> {
                    break;
                }
                case "4" -> {
                    break;
                }
                case "0" -> aux = 1;
                default -> System.err.println("Opcion ingresada no valida");
            }
        }while (aux==0);

    }

}
