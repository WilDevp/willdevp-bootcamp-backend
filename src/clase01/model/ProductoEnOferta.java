package clase01.model;

public class ProductoEnOferta extends Producto{
    private double descuento;

    public ProductoEnOferta(int id, String nombre, double precio, double descuento) {
        super(id, nombre, precio); // Llamamos al constructor de la clase padre
        this.descuento = descuento;
    }

    @Override
    public void mostrarInformacion(){
        double precioFinal = getPrecio() - (getPrecio() * descuento);
        System.out.println("ID: " + getId() + " Nombre: " + getNombre() + " Precio Original: $" + getPrecio() + " Precio con Descuento: " + precioFinal);
    }

    public void setDescuento(double descuento){
        if (descuento >= 0 && descuento <= 1){ // TODO: Cambiar la condiciones para que el descuento sea entre 0 y 100
            this.descuento = descuento;
        }else {
            System.out.println("El descuento debe ser un valor entre 0 y 1");
        }
    }
}
