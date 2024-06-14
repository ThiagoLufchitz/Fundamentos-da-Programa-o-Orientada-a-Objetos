/*Aluno modeloo Dorfman Lufchitz
 *Materia :  Fundamentos da Programação Orientada a Objetos
 */
package modelo;

public class Terreno extends Financiamento {
    private String TipoZona;

    public Terreno(double valorimovel, int prazoMensal, double taxaJurosAnual, String TipoZona) {
        super(valorimovel, prazoMensal, taxaJurosAnual);
        this.TipoZona = TipoZona;
    }

    @Override
    public double PagamentoMensal() {
        double taxaMensal = (getTaxaJurosAnual() / 100) / 12.0;
        int meses = getPrazoFinanciamento() * 12;
        System.out.printf("Taxa Mensal : %.2f\n", taxaMensal);
        System.out.printf("Meses : %d\n", meses);
        double amortizacao = getValorImovel() / meses;
        double pagamentoMensal = (amortizacao * (1 + taxaMensal)) * 1.02;
        System.out.printf("Valor Parcial: %.3f\n", pagamentoMensal);
        return pagamentoMensal;
    }

    @Override
    public void ShowDadosImovel() {
        super.ShowDadosImovel();
        System.out.printf("Tipo da Zona: %s\n", TipoZona);
    }

}