package clase01.model;

public class Producto {
    private String nombre;
    private double precio;
    private int id;

    //constructor
    public Producto(String nombre, double precio, int id){
        this.nombre = nombre;
        this.precio = precio;
        this.id = id;
    }

    // Getters and
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0){
            this.precio = precio;
        }else {
            System.out.println("El precio debe ser positivo");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void mostrarInformacion(){
        System.out.println("ID: " + id + "Nombre: " + nombre + "Precio: $" + precio);
    }

}
