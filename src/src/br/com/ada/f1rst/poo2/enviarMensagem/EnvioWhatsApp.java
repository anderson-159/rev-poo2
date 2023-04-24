package br.com.ada.f1rst.poo2.enviarMensagem;

public class EnvioWhatsApp implements br.com.ada.f1rst.poo2.enviarMensagem.EnvioMensagem {

    @Override
    public void enviarMensagem(String mensagem) {

        System.out.println("Enviando a mensagem por whatsapp: \n " + mensagem);

    }

    @Override
    public void metodoInterface() {

    }

    public void metodoClasseWhatsApp() {

    }

}
