package srp;

public class PedidoPrinter {

    public void imprimir(Pedido pedido) {

        System.out.println("Pedido: " + pedido.getNumero());
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Valor: " + pedido.getValor());

    }

}