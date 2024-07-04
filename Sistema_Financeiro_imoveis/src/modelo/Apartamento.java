/*Aluno modeloo Dorfman Lufchitz
 *Materia :  Fundamentos da Programação Orientada a Objetos
 */
package modelo;

import java.io.Serializable;

@SuppressWarnings("unused")
public class Apartamento extends Financiamento implements Serializable {
    private int NumVagasGaragem;
    private int NumAndar;

    public Apartamento(double valorimovel, int prazoMensal, double taxaJurosAnual, int NumVagasGaragem,
            int NumAndar) {
        super(valorimovel, prazoMensal, taxaJurosAnual);
        this.NumVagasGaragem = NumVagasGaragem;
        this.NumAndar = NumAndar;
    }

    public Apartamento() {
        super(0, 0, 0);
        this.NumVagasGaragem = 0;
        this.NumAndar = 0;
    }

    public int getNumVagasGaragem() {
        return NumVagasGaragem;
    }

    public int getNumAndar() {
        return NumAndar;
    }

    // Sob Escrevendo a função de Financiamento
    @Override
    public double PagamentoMensal() {
        double taxaMensal = (getTaxaJurosAnual() / 100) / 12.0;
        int meses = getPrazoFinanciamento() * 12;
        double pagamentoParcial = (taxaMensal * Math.pow(1 + taxaMensal, meses))
                / (Math.pow(1 + taxaMensal, meses) - 1);
        double pagamentoTotal = getValorImovel() * pagamentoParcial;
        return pagamentoTotal;
    }

    // Sob Escrevendo a função de print
    @Override
    public void ShowDadosImovel() {
        super.ShowDadosImovel();
        System.out.printf("Numero de Vagas na Garagem: %d\n", NumVagasGaragem);
        System.out.printf("Numero do Andar do Apartamento: %d\n", NumAndar);
    }
}
