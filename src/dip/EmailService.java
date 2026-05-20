package dip;

public class EmailService implements CanalNotificacao {

    @Override
    public void enviarMensagem(String mensagem) {

        System.out.println("Email: " + mensagem);

    }

}