package clase01;

import clase01.model.Inventario;
import clase01.model.Producto;
import clase01.model.ProductoEnOferta;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario(); // Objeto de la clase invetario
        Scanner scanner = new Scanner(System.in); // Objeto de la clase scanner para ingreso de texto por terminar

        while (true){
            // Menu
            System.out.println("\n--- Menú de inventario ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Listar Productos");
            System.out.println("3. Buscar Productos");
            System.out.println("4. Actualizar Producto");
            System.out.println("5. Eliminar Producto");
            System.out.println("6. Salir");
            System.out.println("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            // Switch
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el ID del producto: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // clean cache
                    System.out.println("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el precio del producto: ");
                    double precio = scanner.nextDouble();
                    System.out.println("¿El producto esta en oferta? si/no");
                    String respuesta = scanner.next();
                    if (respuesta.equalsIgnoreCase("si")){
                        System.out.println("Ingrese el porcentage de descuento (ej. 0.2 para 20%");
                        double descuento = scanner.nextDouble();
                        ProductoEnOferta productoEnOferta = new ProductoEnOferta(id,nombre,precio, descuento);
                        inventario.agregarProducto(productoEnOferta);
                    }else {
                        Producto producto = new Producto(id, nombre, precio);
                        inventario.agregarProducto(producto);
                    }
                    break;
                case 2:
                    inventario.listarProductos();
                    break;
                case 3:
                    System.out.println("Ingrese el ID del producto: ");
                    int idBuscar = scanner.nextInt();
                    Producto producto = inventario.buscarProducto(idBuscar);
                    if (producto != null){
                        producto.mostrarInformacion();
                    }else{
                        System.out.println("No se encontro el producto con el id: " + idBuscar);

                    }
                    break;
                case 4:
                    System.out.println("Ingrese el ID del producto que deseas actualizar: ");
                    int idActualizar = scanner.nextInt();
                    scanner.nextLine(); // clean cache
                    System.out.println("Ingrese el nuevo nombre del producto: ");
                    String nombreActualizar= scanner.nextLine();
                    System.out.println("Ingrese el nuevo precio del producto: ");
                    double precioActualizar = scanner.nextDouble();
                    inventario.actualizarProducto(idActualizar,nombreActualizar, precioActualizar);
                    break;
                case 5:
                    System.out.println("Ingrese el ID del producto que deseas actualizar: ");
                    int idEliminar = scanner.nextInt();
                    inventario.eliminarProducto(idEliminar);
                    break;
                case 6:
                    System.out.println("Estas saliendo del sistema. 😒");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no valida! 🤬");
            }
        }


    }
}
