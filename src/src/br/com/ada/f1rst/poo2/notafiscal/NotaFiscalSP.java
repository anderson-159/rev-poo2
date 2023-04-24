package br.com.ada.f1rst.poo2.notafiscal;

public class NotaFiscalSP extends br.com.ada.f1rst.poo2.notafiscal.NotaFiscal {

    private final double PORC_IMPOSTO = 5;

    @Override
    protected String infoFiscal() {
        return "Estado de Sao Paulo";
    }

    @Override
    protected double calcularImposto() {
        return super.getValorTotal() * (PORC_IMPOSTO / 100) ;
    }

}
