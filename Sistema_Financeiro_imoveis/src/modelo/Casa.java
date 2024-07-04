/*Aluno modeloo Dorfman Lufchitz
 *Materia :  Fundamentos da Programação Orientada a Objetos
 */
package modelo;

import modelo.Excecoes.DescontoMaiorDoQueJurosException;

public class Casa extends Financiamento {
    private double TamAreaConstruida;
    private double TamTerreno;

    public Casa(double valorimovel, int prazoMensal, double taxaJurosAnual, double TamAreaConstruida,
            double TamTerreno) {
        super(valorimovel, prazoMensal, taxaJurosAnual);
        this.TamAreaConstruida = TamAreaConstruida;
        this.TamTerreno = TamTerreno;
    }

    // Sob Escrevendo a função de Financiamento
    @Override
    public double PagamentoMensal() {
        double taxaMensal = (getTaxaJurosAnual() / 100) / 12.0;
        int meses = getPrazoFinanciamento() * 12;
        double amortizacao = getValorImovel() / meses;
        double pagamentoMensal = (amortizacao * (1 + taxaMensal)) + 80;
        return pagamentoMensal;
    }

    public void AplicarDesconto(double desconto) throws DescontoMaiorDoQueJurosException {
        double juroMensal = PagamentoMensal() * (getPrazoFinanciamento() * 12);

        if (desconto > juroMensal) {
            throw new DescontoMaiorDoQueJurosException("O desconto não pode ser maior que os juros do financiamento.");
        }
    }

    // Sob Escrevendo a função de print
    @Override
    public void ShowDadosImovel() {
        System.out.printf("Tamanho da Área Construida: %.2f m²\n", TamAreaConstruida);
        System.out.printf("Tamanho do Terreno: %.f m²\n", TamTerreno);
        super.ShowDadosImovel();
    }
}
