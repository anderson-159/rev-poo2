package br.com.ada.f1rst.poo2.main;

import br.com.ada.f1rst.poo2.enviarMensagem.*;
import br.com.ada.f1rst.poo2.notafiscal.Cliente;
import br.com.ada.f1rst.poo2.notafiscal.NotaFiscal;
import br.com.ada.f1rst.poo2.notafiscal.NotaFiscalMG;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TesteNotaFiscal {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Nome do cliente");

        NotaFiscal notaFiscal = new NotaFiscalMG();
        notaFiscal.setCliente(cliente);
        notaFiscal.setDescricao("Serviço XYZ");
        notaFiscal.setDataEmissao(LocalDateTime.now());
        notaFiscal.setValorTotal(200);
        notaFiscal.setNumero(2001);

        br.com.ada.f1rst.poo2.enviarMensagem.EnviarDadosNFService enviarDadosNFService =
                new br.com.ada.f1rst.poo2.enviarMensagem.EnviarDadosNFService();

        enviarDadosNFService.enviarDados(notaFiscal, getTiposMensagem(args));

    }

    static br.com.ada.f1rst.poo2.enviarMensagem.EnvioMensagem[] getTiposMensagem(String[] args) {

        List<br.com.ada.f1rst.poo2.enviarMensagem.EnvioMensagem> envioMensagemsList = new ArrayList<>();

        if (args == null || args.length == 0) {
            envioMensagemsList.add(new br.com.ada.f1rst.poo2.enviarMensagem.EnvioEmail());
        } else {
            for (String arg : args) {
                if ("email".equals(arg)) {
                    envioMensagemsList.add(new br.com.ada.f1rst.poo2.enviarMensagem.EnvioEmail());
                } else if ("sms".equals(arg)) {
                    envioMensagemsList.add(new br.com.ada.f1rst.poo2.enviarMensagem.EnvioSMS());
                } else if ("wz".equals(arg)) {
                    envioMensagemsList.add(new br.com.ada.f1rst.poo2.enviarMensagem.EnvioWhatsApp());
                } else if ("correio".equals(arg)) {
                    envioMensagemsList.add(new br.com.ada.f1rst.poo2.enviarMensagem.EnvioCorreio());
                }
            }
        }

        br.com.ada.f1rst.poo2.enviarMensagem.EnvioMensagem[] arrayMensagens = new br.com.ada.f1rst.poo2.enviarMensagem.EnvioMensagem[envioMensagemsList.size()];

        return envioMensagemsList.toArray(arrayMensagens);

    }

}