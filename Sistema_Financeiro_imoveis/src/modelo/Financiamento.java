/*Aluno modeloo Dorfman Lufchitz
 *Materia :  Fundamentos da Programação Orientada a Objetos
 */
package modelo;

public class Financiamento {

    @SuppressWarnings("unused")
    private double valorimovel;
    @SuppressWarnings("unused")
    private int prazoFinanciamento;
    @SuppressWarnings("unused")
    private double taxaJurosAnual;

    public Financiamento(double valorimovel, int prazoFinanciamento, double taxaJurosAnual) {
        this.valorimovel = valorimovel;
        this.prazoFinanciamento = prazoFinanciamento;
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public double PagamentoMensal(double valorimovel, int prazoFinanciamento, double taxaJurosAnual) {
        return (valorimovel / (prazoFinanciamento * 12)) * (1 + (taxaJurosAnual / 12));
    }

    public double TotaldoPagamento(double PagamentoMensal, int prazoFinanciamento) {
        return PagamentoMensal * (prazoFinanciamento * 12);
    }

}
