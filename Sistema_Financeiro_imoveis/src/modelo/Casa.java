/*Aluno modeloo Dorfman Lufchitz
 *Materia :  Fundamentos da Programação Orientada a Objetos
 */
package modelo;

public class Casa extends Financiamento {
    private double TamAreaConstruida;
    private double TamTerreno;

    public Casa(double valorimovel, int prazoMensal, double taxaJurosAnual, double TamAreaConstruida,
            double TamTerreno) {
        super(valorimovel, prazoMensal, taxaJurosAnual);
        this.TamAreaConstruida = TamAreaConstruida;
        this.TamTerreno = TamTerreno;
    }

    @Override
    public double PagamentoMensal() {
        double taxaMensal = (getTaxaJurosAnual() / 100) / 12.0;
        int meses = getPrazoFinanciamento() * 12;
        System.out.printf("Taxa Mensal : %.2f\n", taxaMensal);
        System.out.printf("Meses : %d\n", meses);
        double amortizacao = getValorImovel() / meses;
        double pagamentoMensal = (amortizacao * (1 + taxaMensal)) + 80;
        System.out.printf("Valor Parcial: %.3f\n", pagamentoMensal);
        return pagamentoMensal;
    }

    @Override
    public void ShowDadosImovel() {
        super.ShowDadosImovel();
        System.out.printf("Tamanho da Área Construida: %.2f m²\n", TamAreaConstruida);
        System.out.printf("Tamanho do Terreno: %.f m²\n", TamTerreno);
    }
}
