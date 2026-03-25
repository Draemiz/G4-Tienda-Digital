public class Carrito {
    private String nombreCliente;
    private String[] productos;
    private double[] precio;
    private int cantidad;
    public Carrito(String nombreCliente) {
        this.nombreCliente = nombreCliente;
        this.productos = new String[10];
        this.precio = new double[10];
        this.cantidad = 0;
    }

    public void agregarProducto(String nombre, double precio){
        if(cantidad < 10){
            productos[cantidad] = nombre;
            this.precio[cantidad] = precio;
            cantidad++;
            System.out.println("Producto agregado: "
             + nombre + " - Precio: ($" + precio + " )");
        } else {
            System.out.println("Carrito lleno, no se pueden agregar más productos.");
        }
    }

    public void calcularTotal(){
        double total = 0;
        for(int i = 0; i < cantidad; i++){
            total += precio[i];
        }
        System.out.println("Total a pagar: $" + total);
    }

    public void mostrarResumen(){
        System.out.println("===== Carrito de " + nombreCliente + " =====");
        for(int i = 0; i < cantidad; i++){
            System.out.println("- " + productos[i] + ": $" + precio[i]);
        }
    }
    
}
