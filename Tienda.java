public class Tienda {
    
    private String nombreTienda;
    private String[] productos; 
    private int totalProductos; 
    
    public Tienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
        this.productos = new String[10]; 
        this.totalProductos = 0;
    }
}

    public void registrarProducto(String nombre) {
        if (totalProductos < 10) {
            productos[totalProductos] = nombre;
            totalProductos++;
            System.out.println("Producto registrado: " + nombre); 
        } else {
            System.out.println("Catálogo lleno.");
        }
    }
