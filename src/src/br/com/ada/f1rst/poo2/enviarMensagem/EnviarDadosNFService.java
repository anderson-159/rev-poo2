package br.com.ada.f1rst.poo2.enviarMensagem;

import br.com.ada.f1rst.poo2.notafiscal.NotaFiscal;

import java.util.List;

public class EnviarDadosNFService {

    public void enviarDados(NotaFiscal notaFiscal, br.com.ada.f1rst.poo2.enviarMensagem.EnvioMensagem... envioMensagemList) {

        String detalhesNF = notaFiscal.exibirDetalhes();

        for (br.com.ada.f1rst.poo2.enviarMensagem.EnvioMensagem envioMensagem : envioMensagemList) {
            envioMensagem.enviarMensagem(detalhesNF);

            envioMensagem.metodoInterface();

            if (envioMensagem instanceof EnvioWhatsApp) {
                ((br.com.ada.f1rst.poo2.enviarMensagem.EnvioWhatsApp) envioMensagem).metodoClasseWhatsApp();
            }
        }

    }

}
