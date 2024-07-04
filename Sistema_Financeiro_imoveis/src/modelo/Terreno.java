/*Aluno modeloo Dorfman Lufchitz
 *Materia :  Fundamentos da Programação Orientada a Objetos
 */
package modelo;

import java.io.Serializable;

@SuppressWarnings("unused")
public class Terreno extends Financiamento implements Serializable {
    private String TipoZona;

    public Terreno(double valorimovel, int prazoMensal, double taxaJurosAnual, String TipoZona) {
        super(valorimovel, prazoMensal, taxaJurosAnual);
        this.TipoZona = TipoZona;
    }

    public Terreno() {
        super(0, 0, 0);
        this.TipoZona = "";
    }

    public String getTipoZona() {
        return TipoZona;
    }

    // Sob Escrevendo a função de Financiamento
    @Override
    public double PagamentoMensal() {
        double taxaMensal = (getTaxaJurosAnual() / 100) / 12.0;
        int meses = getPrazoFinanciamento() * 12;
        double amortizacao = getValorImovel() / meses;
        double pagamentoMensal = (amortizacao * (1 + taxaMensal)) * 1.02;
        return pagamentoMensal;
    }

    // Sob Escrevendo a função de print
    @Override
    public void ShowDadosImovel() {
        super.ShowDadosImovel();
        System.out.printf("Tipo da Zona: %s\n", TipoZona);
    }
}