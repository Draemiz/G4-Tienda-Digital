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

