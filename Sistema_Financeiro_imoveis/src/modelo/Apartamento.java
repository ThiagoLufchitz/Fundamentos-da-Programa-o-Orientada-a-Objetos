/*Aluno modeloo Dorfman Lufchitz
 *Materia :  Fundamentos da Programação Orientada a Objetos
 */
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
        double amortizacao = getValorImovel() / meses;
        System.out.printf("Valor Amortizado: %.2f\n", amortizacao);
        double pagamentoMensal = Math.pow(1 + taxaMensal, meses) / ((1 + Math.pow(1 + taxaMensal, meses)) - 1);
        // (500000 * (1+(0,10/12))^(10*12))/((1+(0,10/12))^(10*12) - 1) = 6607,537
        return pagamentoMensal;
    }
}
