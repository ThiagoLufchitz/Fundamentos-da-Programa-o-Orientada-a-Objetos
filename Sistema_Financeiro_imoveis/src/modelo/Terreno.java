package modelo;

public class Terreno extends Financiamento {
    public Terreno(double valorimovel, int prazoMensal, double taxaJurosAnual) {
        super(valorimovel, prazoMensal, taxaJurosAnual);
    }

    @Override
    public double PagamentoMensal() {
        double taxaMensal = (getTaxaJurosAnual() / 100) / 12.0;
        int meses = getPrazoFinanciamento() * 12;
        System.out.printf("Taxa Mensal : %.2f\n", taxaMensal);
        System.out.printf("Meses : %d\n", getPrazoFinanciamento());
        double pagamentoMensal = ((getValorimovel() / meses) * taxaMensal) * 1.02;
        System.out.printf("Valor Parcial: %.2f\n", pagamentoMensal);
        return pagamentoMensal;
    }

}