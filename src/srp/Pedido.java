package srp;

public class Pedido {

    private int numero;
    private String cliente;
    private double valor;

    public Pedido(int numero, String cliente, double valor) {
        this.numero = numero;
        this.cliente = cliente;
        this.valor = valor;
    }

    public int getNumero() {
        return numero;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }
}