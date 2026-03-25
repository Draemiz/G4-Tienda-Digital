import USERS.Producto;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== Bienvenido a la Tienda Digital =====");
        System.out.println();

        // ── Integrante 1: Producto ──
        Producto p1 = new Producto("Audifonos", 100.0, 10, "Electronica");

        p1.mostrarInfo();
        System.out.println();

        p1.aplicarDescuento(10);
        System.out.println();

        p1.verificarStock(5);

        System.out.println();

        // ── Integrante 2: Cliente ──
        // (solo si existe la clase Cliente)
        // Cliente c1 = new Cliente("Alexandra", 100);
        // c1.mostrarPerfil();
        // c1.realizarCompra(50);
        // c1.mostrarSaldo();

        System.out.println();

        // ── Integrante 3: Carrito ──
        // (solo si existe la clase Carrito)
        // Carrito carrito = new Carrito();
        // carrito.agregarProducto(p1);
        // carrito.calcularTotal();
        // carrito.mostrarResumen();

        System.out.println();

        // ── Integrante 4: Tienda ──
        // (solo si existe la clase Tienda)
        // Tienda tienda = new Tienda();
        // tienda.registrarProducto(p1);
        // tienda.buscarProducto("Audifonos");
        // tienda.generarReporte();

        System.out.println();
        System.out.println("===== Fin del programa =====");
    }
}