package USERS;

public class Producto {
    
    private String nombre;
    private double precio;
    private int stock;
    private String categoria;

    public Producto(String nombre, double precio, int stock, String categoria){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria; 
    }

    public void mostarInfo(){
        System.out.println("Producto: " + nombre);
        System.out.println("Categoria: " + categoria);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
    }

    public void aplicarDescuento(double porcentaje) {
        double precioFinal = precio - (precio * porcentaje / 100);
        System.out.println("Preco con descuento: " + precioFinal);
    }

    public void verificarStock(int cantidad){
        if (cantidad <= stock) {
           System.out.println("Hay stock disponible"); 
        } else{
            System.out.println("No hay suficiente stock"); 
        }
    }
}
