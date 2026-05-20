package ocp;

public class PagamentoPix implements Pagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento via PIX: " + valor);
    }

}