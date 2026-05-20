package dip;

public class SmsService implements CanalNotificacao {

    @Override
    public void enviarMensagem(String mensagem) {

        System.out.println("SMS: " + mensagem);

    }

}