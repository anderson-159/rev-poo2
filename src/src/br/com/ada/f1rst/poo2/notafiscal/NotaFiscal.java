package br.com.ada.f1rst.poo2.notafiscal;

import java.time.LocalDateTime;

public abstract class NotaFiscal {

    private br.com.ada.f1rst.poo2.notafiscal.Cliente cliente;
    private long numero;
    private LocalDateTime dataEmissao;
    private String descricao;
    private double valorTotal;

    public String exibirDetalhes() {

        String detalhes = infoFiscal() + "\n" +
                "Numero: " + numero + "\n " +
                "Data: " + dataEmissao + "\n " +
                "Cliente: " + cliente.getNome() + "\n " +
                "Descricao: " + descricao + "\n " +
                "Valor total: " + valorTotal + "\n " +
                "Valor do imposto: " + calcularImposto() + "\n";

        return detalhes;

    }

    protected abstract String infoFiscal();

    protected abstract double calcularImposto();


    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public br.com.ada.f1rst.poo2.notafiscal.Cliente getCliente() {
        return cliente;
    }

    public void setCliente(br.com.ada.f1rst.poo2.notafiscal.Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDateTime dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}