package ocp;

public class PagamentoDinheiro implements Pagamento {

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento em dinheiro: " + valor);
    }

}