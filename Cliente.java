public class Cliente {

    // Atributos
    private String nombre;
    private String correo;
    private double saldo;
    private int totalCompras;

    // Constructor
    public Cliente(String nombre, String correo, double saldo) {
        this.nombre = nombre;
        this.correo = correo;
        this.saldo = saldo;
        this.totalCompras = 0;
    }

    // Método para mostrar perfil
    public void mostrarPerfil() {
        System.out.println("Cliente: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("Saldo: $" + saldo);
        System.out.println("Compras realizadas: " + totalCompras);
    }

    // Método para realizar compra
    public void realizarCompra(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            totalCompras++;
            System.out.println("Compra exitosa por $" + monto);
            System.out.println("Saldo restante: $" + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
            System.out.println("Saldo actual: $" + saldo);
        }
    }

    // Método para mostrar saldo
    public void mostrarSaldo() {
        System.out.println("Saldo disponible: $" + saldo);
    }

    // Método main para probar
    public static void main(String[] args) {

        Cliente cliente = new Cliente("María López", "maria@email.com", 250.00);

        cliente.mostrarPerfil();
        System.out.println("------------------");

        cliente.realizarCompra(89.99);
        System.out.println("------------------");

        cliente.mostrarSaldo();
        System.out.println("------------------");

        cliente.realizarCompra(200);
    }
}