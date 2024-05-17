/*Aluno modeloo Dorfman Lufchitz
 *Materia :  Fundamentos da Programação Orientada a Objetos
 */
package modelo;

public class Financiamento {

    private double valorimovel;
    private int prazoFinanciamento;
    private double taxaJurosAnual;

    public double getValorimovel() {
        return valorimovel;
    }

    public void setValorimovel(double valorimovel) {
        this.valorimovel = valorimovel;
    }

    public int getPrazoFinanciamento() {
        return prazoFinanciamento;
    }

    public void setPrazoFinanciamento(int prazoFinanciamento) {
        this.prazoFinanciamento = prazoFinanciamento;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void setTaxaJurosAnual(double taxaJurosAnual) {
        this.taxaJurosAnual = taxaJurosAnual;
    }

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
