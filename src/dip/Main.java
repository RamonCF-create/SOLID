package dip;

public class Main {

    public static void main(String[] args) {

        Notificador notificador =
                new Notificador(new WhatsAppService());

        notificador.notificar("Pedido saiu para entrega.");

    }

}