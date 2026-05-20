package dip;

public class WhatsAppService implements CanalNotificacao {

    @Override
    public void enviarMensagem(String mensagem) {

        System.out.println("WhatsApp: " + mensagem);

    }

}