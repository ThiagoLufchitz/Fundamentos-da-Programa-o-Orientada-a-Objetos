package modelo;

public class Casa extends Financiamento {
    public Casa(double valorimovel, int prazoMensal, double taxaJurosAnual) {
        super(valorimovel, prazoMensal, taxaJurosAnual);
    }

    @Override
    public double PagamentoMensal() {
        double taxaMensal = (getTaxaJurosAnual() / 100) / 12.0;
        int meses = getPrazoFinanciamento() * 12;
        System.out.printf("Taxa Mensal : %.2f\n", taxaMensal);
        System.out.printf("Meses : %d\n", getPrazoFinanciamento());
        double pagamentoMensal = (getValorimovel() / meses) * (1 + taxaMensal) + 80;
        System.out.printf("Valor Parcial: %.2f\n", pagamentoMensal);
        return pagamentoMensal;
    }
}