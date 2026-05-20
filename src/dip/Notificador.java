package dip;

public class Notificador {

    private CanalNotificacao canal;

    public Notificador(CanalNotificacao canal) {
        this.canal = canal;
    }

    public void notificar(String mensagem) {

        canal.enviarMensagem(mensagem);

    }

}