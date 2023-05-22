package ejercicios;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio5 {
    static HashMap<String, Double> lista = new HashMap<>();
    static Scanner sc =  new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        int opc;
        do {
            System.out.println("PRODUCTOS");
            System.out.println("1. Alta de producto");
            System.out.println("2. Baja de producto");
            System.out.println("3. Listar existencias");
            System.out.println("4. Salir.");
            opc = sc.nextInt();
            switch (opc){
                case 1:
                    alta();
                    break;
                case 2:
                    baja();
                    break;
                case 3:
                    listar();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while (opc != 4);
    }
    public static void alta(){
        String nombre;
        double precio;
        sc.nextLine();
        System.out.println("Introduzca el nombre y el precio del producto");
        nombre = sc.nextLine();
        precio = sc.nextDouble();
        lista.put(nombre, precio);
    }
    public static void baja(){
        String nombre;
        sc.nextLine();
        System.out.println("Introduzca el nombre del producto");
        nombre = sc.nextLine();
        Double hecho = lista.remove(nombre);
        if (hecho == null)
            System.out.println("No se ha podido dar de baja al producto especificado");
    }
    public static void listar(){
        System.out.println(lista);
    }
}