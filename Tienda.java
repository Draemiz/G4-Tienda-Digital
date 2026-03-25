public class Tienda {
    private String nombreTienda;
    private String[] productos;
    private int totalProductos;

    public Tienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
        this.productos = new String[10];
        this.totalProductos = 0;
    }

    public void registrarProducto(String nombre) {
        if (totalProductos < 10) {
            productos[totalProductos] = nombre;
            totalProductos++;
            System.out.println("Producto registrado: " + nombre);
        }
    }

    public void buscarProducto(String nombre) {
        boolean encontrado = false;
        for (int i = 0; i < totalProductos; i++) {
            if (productos[i].equalsIgnoreCase(nombre)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Encontrado: " + nombre);
        } else {
            System.out.println("No encontrado: " + nombre);
        }
    }

    public void generarReporte() {
        System.out.println("Tienda: " + nombreTienda);
        System.out.println("Cantidad de productos registrados: " + totalProductos);
        for (int i = 0; i < totalProductos; i++) {
            System.out.println((i + 1) + ". " + productos[i]);
        }
    }
}