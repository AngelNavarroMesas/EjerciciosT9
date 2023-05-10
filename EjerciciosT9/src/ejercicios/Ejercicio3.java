package ejercicios;

import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio3 {
	
    static TreeSet<String> lista = new TreeSet();
    public static void main(String[] args) {
        insertar();
        System.out.println(lista);
    }
    public static void insertar(){
        Scanner sc = new Scanner(System.in);
        String nombre;
        do {
            nombre = sc.next();
            if (!nombre.equals("fin")){
                lista.add(nombre);
            }
        }while (!nombre.equals("fin"));
    }
}
