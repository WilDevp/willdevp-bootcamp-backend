package clase01.model;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;  // Pasando el objeto Producto a la clase Inventario

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
        System.out.println("Producto agregado correctamente");
    }

    public void listarProductos(){
       if (productos.isEmpty()){
              System.out.println("No hay productos en el inventario");
       }else {
           System.out.println("Productos en el inventario");
           for(Producto producto: productos){
                producto.mostrarInformacion();
           }
       }
    }

    public Producto buscarProducto(int id){
       for (Producto producto: productos){
           if (producto.getId() == id){
                return producto;
           }
       }
        return null;
    }

    public void eliminarProducto(int id){
        Producto producto = buscarProducto(id);
        if (producto != null){
            productos.remove(producto);
            System.out.println("Producto " + producto.getNombre() + "eliminado correctamente");
        }else {
            System.out.println("No se encontro el producto con el id: " + id);
        }
    }

    public void modificarProducto(int id, String nombre, double precio){
        Producto producto = buscarProducto(id);
        if (producto != null){
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            System.out.println("Producto modificado correctamente " + producto.getNombre());
        }else {
            System.out.println("No se encontro el producto con el id: " + id);
        }
    }
}
