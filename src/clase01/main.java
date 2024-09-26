package clase01;

import clase01.model.Inventario;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de inventario");
        System.out.println("1. Ingresa el nombre del producto");
        String nombreProducto = scanner.nextLine();
        System.out.println("El nombre del producto es: " + nombreProducto);

    }
}
