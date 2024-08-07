/*Aluno modeloo Dorfman Lufchitz
 *Materia :  Fundamentos da Programação Orientada a Objetos
 */
package modelo;

import java.io.Serializable;

import modelo.Excecoes.DescontoMaiorDoQueJurosException;

@SuppressWarnings("unused")
public class Casa extends Financiamento implements Serializable {
    private double TamAreaConstruida;
    private double TamTerreno;

    public Casa(double valorimovel, int prazoMensal, double taxaJurosAnual, double TamAreaConstruida,
            double TamTerreno) {
        super(valorimovel, prazoMensal, taxaJurosAnual);
        this.TamAreaConstruida = TamAreaConstruida;
        this.TamTerreno = TamTerreno;
    }

    public Casa() {
        super(0, 0, 0);
        this.TamAreaConstruida = 0;
        this.TamTerreno = 0;
    }

    public double getTamAreaConstruida() {
        return TamAreaConstruida;
    }

    public double getTamTerreno() {
        return TamTerreno;
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

    // SobEscrevendo a função de print pegando dados da mae e acrecenta dados do
    // filho
    @Override
    public void ShowDadosImovel() {
        super.ShowDadosImovel();
        System.out.printf("Tamanho da Área Construida: %.2f m²\n", TamAreaConstruida);
        System.out.printf("Tamanho do Terreno: %.2f m²\n", TamTerreno);
    }
}
