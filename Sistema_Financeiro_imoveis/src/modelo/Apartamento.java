/*Aluno modeloo Dorfman Lufchitz
 *Materia :  Fundamentos da Programação Orientada a Objetos
 */
package modelo;

public class Apartamento extends Financiamento {
    private int NumVagasGaragem;
    private int NumAndar;

    public Apartamento(double valorimovel, int prazoMensal, double taxaJurosAnual, int NumVagasGaragem,
            int NumAndar) {
        super(valorimovel, prazoMensal, taxaJurosAnual);
        this.NumVagasGaragem = NumVagasGaragem;
        this.NumAndar = NumAndar;
    }

    @Override
    public double PagamentoMensal() {
        double taxaMensal = (getTaxaJurosAnual() / 100) / 12.0;
        int meses = getPrazoFinanciamento() * 12;
        System.out.printf("Taxa Mensal : %.2f\n", taxaMensal);
        System.out.printf("Meses : %d\n", meses);
        double pagamentoParcial = (taxaMensal * Math.pow(1 + taxaMensal, meses))
                / (Math.pow(1 + taxaMensal, meses) - 1);
        double pagamentoTotal = getValorImovel() * pagamentoParcial;
        System.out.printf("Valor Parcial: %.3f\n", pagamentoTotal);
        return pagamentoTotal;
    }

    @Override
    public void ShowDadosImovel() {
        super.ShowDadosImovel();
        System.out.printf("Numero de Vagas na Garagem: %d\n", NumVagasGaragem);
        System.out.printf("Numero do Andar do Apartamento: %d\n", NumAndar);
    }
}
