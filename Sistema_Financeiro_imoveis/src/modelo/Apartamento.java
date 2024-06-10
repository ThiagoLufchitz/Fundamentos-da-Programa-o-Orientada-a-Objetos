package modelo;

public class Apartamento extends Financiamento {
    public Apartamento(double valorimovel, int prazoMensal, double taxaJurosAnual) {
        super(valorimovel, prazoMensal, taxaJurosAnual);
    }

    @Override
    public double PagamentoMensal() {
        double taxaMensal = (getTaxaJurosAnual() / 100) / 12.0;
        int meses = getPrazoFinanciamento() * 12;
        System.out.printf("Taxa Mensal : %.2f\n", taxaMensal);
        System.out.printf("Meses : %d\n", getPrazoFinanciamento());
        double valorcima = getValorimovel() * Math.pow(1 + taxaMensal, meses);
        double valorbaixo = Math.pow(1 + taxaMensal, meses - 1.0);
        System.out.printf("Valor Parcial: %.2f\n", valorcima / valorbaixo);
        return valorcima / valorbaixo;
    }
}
