package srp;

public class Main {

    public static void main(String[] args) {

        Pedido pedido = new Pedido(1, "Ramon", 50);

        PedidoRepository repository = new PedidoRepository();
        PedidoPrinter printer = new PedidoPrinter();

        repository.salvar(pedido);
        printer.imprimir(pedido);

    }

}